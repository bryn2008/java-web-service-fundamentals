package training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;

@Component
@Profile("csv")
public class ObservationFile extends ObservationBase {
    @Autowired
    public void ObservationFile(ResourceLoader loader, @Value("${observations.csv.path}") String path) {
        try {
            try (BufferedReader reader = Files.newBufferedReader(loader.getResource(path).getFile().toPath())) {
                String line = reader.readLine(); //discard header
                while ((line = reader.readLine()) != null) {
                    String[] fields = line.split(",");
                    LocalDate date = LocalDate.parse(fields[0].trim());
                    double minT = Double.parseDouble(fields[1]);
                    double maxT = Double.parseDouble(fields[2]);
                    observations.put(date, new MinMax(date, maxT, minT));
                }
            }
        }
        catch (IOException ex) {
            throw new ObservationException(ex, "Cannot read CSV file %s", path);
        }
    }
}
