package training;

public class MinMaxSimple {
    private double minT = Double.MIN_VALUE;
    private double maxT = Double.MAX_VALUE;

    public MinMaxSimple(double minT, double maxT) {
//        this.minT = minT;
//        this.maxT = maxT;
        setMinT(minT);
        setMaxT(maxT);
    }

    public MinMaxSimple( double temp) {
        this(temp, temp);
    }

    public MinMaxSimple() {
    }

    public double getMean() {
        return (minT + maxT) / 2.;
    }

    public double getMinT() {
        return minT;
    }

    public void setMinT(double minT) {
        if (minT > this.maxT) {
            throw new IllegalArgumentException("Minimum cannot be less than maximum");
        }
        this.minT = minT;
    }

    public double getMaxT() {
        return maxT;
    }

    public void setMaxT(double maxT) {
        if (maxT < this.minT) {
            throw new IllegalArgumentException("Maximum cannot be more than minimum");
        }
        this.maxT = maxT;
    }
}
