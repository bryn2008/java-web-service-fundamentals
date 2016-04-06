package training;

import java.time.LocalDate;

public class MinMax {
    private double minT = Double.MIN_VALUE;
    private double maxT = Double.MAX_VALUE;
    private LocalDate date;

    public MinMax() {
    }

    public MinMax(LocalDate date, double minT, double maxT) {
        this.date = date;
        setMinT(minT);
        setMaxT(maxT);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getMean() {
        return (minT + maxT) / 2.;
    }

    public double getMinT() {
        return minT;
    }

    public void setMinT(double minT) {
        if (minT > maxT) {
            throw new ObservationException("Minimum %.2f cannot be less than maximum %.2f", minT, maxT);
        }
        this.minT = minT;
    }

    public double getMaxT() {
        return maxT;
    }

    public void setMaxT(double maxT) {
        if (maxT < minT) {
            throw new ObservationException("Maximum %.2f cannot be more than minimum %.2f", maxT, minT);
        }
        this.maxT = maxT;
    }

    @Override
    public String toString() {
        return String.format("MinMax {min=%.2f max=%.2f}", minT, maxT);
    }
}
