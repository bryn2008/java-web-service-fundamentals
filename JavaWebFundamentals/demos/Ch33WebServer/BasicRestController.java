
package training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Random;

@RestController
@Profile("production")
public class BasicRestController {

    @RequestMapping("/hello")
    String hello() {
        return "Hello REST";
    }

    @RequestMapping("/greet/{name}")
    String hello(@PathVariable String name) {
        return "PATH hello "+name;
    }

    private static final Random random = new Random();

    @RequestMapping("/random/{low}/{high}")
    int hello(@PathVariable int low, @PathVariable int high) {
        return random.nextInt(high-low+1)+low;
    }

    @RequestMapping("/weekday/{date}")
    String weekday(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
    }

    @Autowired
    private Observations file;

    @Value("${observations.path}")
    private String path;

    @RequestMapping("/observation/read/{date}")
    MinMax readObservation(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        file.load(path);
        return file.read(date);
    }


}
