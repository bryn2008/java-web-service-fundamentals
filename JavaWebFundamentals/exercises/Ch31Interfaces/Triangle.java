package solutions;

import java.awt.*;
import java.util.Arrays;

public class Triangle extends Shape {
    private double[] sides;

    public Triangle(double[] sides, Color color) {
        super(color);
        this.sides = Arrays.copyOf(sides, sides.length);
        Arrays.sort(this.sides);
        if (sides.length != 3) {
            throw new ShapeException("Triangles have 3 sides");
        }
        if (sides[0]<=0 || sides[1]<=0 || sides[2]<=0) {
            throw new ShapeException("Triangle sides must be greater than zero");
        }
        if (sides[0]+sides[1] <= sides[2]) {
            throw new ShapeException("Invalid triangle");
        }
    }

    @Override
    public String toString() {
        return String.format("Triangle %s, sides=%s", super.toString(), Arrays.toString(sides));
    }

    @Override
    public double getArea() {
        double p = (sides[0]+sides[1]+sides[2])/2;
        return Math.sqrt(p*(p-sides[0])*(p-sides[1])*(p-sides[2]));
    }

    public static enum Category {
        PLAIN, ISOSCELES, EQUILATERAL, RIGHT_ANGLED
    }

    public Category getCategory() {
        if (sides[0]==sides[1] && sides[1]==sides[2]) {
            return Category.EQUILATERAL;
        }
        if (sides[0]==sides[1] || sides[1]==sides[2] || sides[0]==sides[2]){
            return Category.ISOSCELES;
        }
        if (Math.abs(sides[0]*sides[0] + sides[1]*sides[1] - sides[2]*sides[2]) < 1.e-5) {
            return Category.RIGHT_ANGLED;
        }
        return Category.PLAIN;
    }
}
