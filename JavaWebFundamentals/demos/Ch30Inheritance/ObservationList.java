package training;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class ObservationList {
    private Map<LocalDate, MinMax> observations = new TreeMap<>();

    protected void add(LocalDate date, double minT, double maxT) {
        observations.put(date, new MinMax(minT, maxT));
    }
}
