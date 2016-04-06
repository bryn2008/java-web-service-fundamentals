package training;

import java.time.LocalDate;

public interface Observations {
    MinMax read(LocalDate date);
}
