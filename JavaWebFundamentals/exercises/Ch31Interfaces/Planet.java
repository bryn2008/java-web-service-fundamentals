package solutions;

public class Planet {
    private String name;
    private double distance;
    private int diameter;

    public Planet(String name, double distance, int diameter) {
        this.name = name;
        this.distance = distance;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return String.format("%s: distance=%.2f, diameter=%%.2f", name, distance , diameter/1000);
    }

    public String getName() {
        return name;
    }

    public double getDistance() {
        return distance;
    }

    public int getDiameter() {
        return diameter;
    }
}

