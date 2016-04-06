package training;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public abstract class ObservationBase {
    protected Map<LocalDate, MinMax> observations = new TreeMap<>();

    public double mean() {
        double sum = 0.0;
        for (MinMax obs : observations.values()) {
            sum += obs.getMean();
        }
        return sum / observations.size();
    }
}
