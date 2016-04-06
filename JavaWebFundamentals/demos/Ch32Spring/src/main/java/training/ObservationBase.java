package training;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public abstract class ObservationBase implements Observations {
    protected Map<LocalDate, MinMax> observations = new TreeMap<>();

    public MinMax read(LocalDate date) {
        if (!observations.containsKey(date)) {
            throw new ObservationException("No observation data for %s", date);
        }
        return observations.get(date);
    }
}
