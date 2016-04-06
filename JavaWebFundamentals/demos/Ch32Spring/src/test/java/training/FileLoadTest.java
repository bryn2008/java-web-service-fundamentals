package training;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

@RunWith( SpringJUnit4ClassRunner.class )
@SpringApplicationConfiguration(classes = {Main.class})
@ActiveProfiles("load")
public class FileLoadTest {
    static final double EPS = 1e-5;

    @Autowired
    private ObservationLoadFile file;

    @Test
    public void testCsvFileHasEntryFor1Jan2000 () {
        file.load("classpath:observations.csv");
        MinMax t = file.read(LocalDate.of(2000,1,1));
        assertThat(t.getMaxT(), is(closeTo(8.4, EPS)));
    }

    @Value("${observations.csv.path}")
    private String path;

    @Test
    public void testCsvFilePropertyHasEntryFor1Jan2000 () {
        file.load(path);
        MinMax t = file.read(LocalDate.of(2000,1,1));
        assertThat(t.getMaxT(), is(closeTo(8.4, EPS)));
    }


}
