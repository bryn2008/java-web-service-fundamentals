package solutions.interfaces;

import java.awt.*;

public class Rectangle extends ShapeBase {
    private double length;
    private double width;

    public Rectangle(double length, double width, Color color) {
        super(color);
        if (length<=0 || width<=0) {
            throw new ShapeException("rectangle sides must be greater than zero");
        }
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return String.format("Rectangle %s, l=%s w=%s", super.toString(), length, width);
    }

    @Override
    public double getArea() {
        return length*width;
    }
}
