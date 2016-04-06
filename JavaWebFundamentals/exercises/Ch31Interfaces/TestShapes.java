package solutions.interfaces;

import org.hamcrest.Matchers;
import org.junit.Test;
import solutions.ShapeException;

import java.awt.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestShapes {
    static final double EPS = 1e-2;

    @Test
    public void testRectangleRed3x2() {
        solutions.Shape shape = new solutions.Rectangle(3, 2, Color.RED);
        assertThat(shape.getColor(), is(Color.RED));
        assertThat(shape.getArea(), is(Matchers.closeTo(6, EPS)));
    }

    @Test(expected=ShapeException.class)
    public void testInvalidRectangleRedMinus3x2() {
        solutions.Shape shape = new solutions.Rectangle(-3, 2, Color.RED);
    }

    @Test(expected=ShapeException.class)
    public void testInvalidRectangleRedMinus3xMinus2() {
        solutions.Shape shape = new solutions.Rectangle(-3, -2, Color.RED);
    }

    @Test(expected=ShapeException.class)
    public void testInvalidRectangleRed3xMinus2() {
        solutions.Shape shape = new solutions.Rectangle(3, -2, Color.RED);
    }
}
