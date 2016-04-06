package solutions.interfaces;

import java.awt.*;

public abstract class Shape {
    private Color color;

    public ShapeBase(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Shape color=%s", color);
    }

    @Override
    public Color getColor() {
        return color;
    }

}
