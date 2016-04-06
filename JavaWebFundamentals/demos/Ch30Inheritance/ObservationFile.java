package training;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;

public class ObservationFile extends ObservationBase {
    public ObservationFile(File file)throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(file.toPath())) {
            String line = reader.readLine(); //discard header
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                observations.put(LocalDate.parse(fields[0].trim()),
                        new MinMax(Double.parseDouble(fields[2]),
                                   Double.parseDouble(fields[1])));
            }
        }
    }
}
