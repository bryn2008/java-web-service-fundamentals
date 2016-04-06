package training;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;


public class MinMaxTest {
    static final double EPS = 1e-5;

    @Test
    public void testMin5Max11MeanIs8() {
        MinMaxSimple t = new MinMaxSimple(5., 11.);
        assertThat(t.getMean(), is(closeTo(8., EPS)));
    }

    @Test
    public void testCreateDefaultSimpleMinMaxObject () {
        MinMaxSimple obs = new MinMaxSimple();
        assertThat(obs.getMaxT(), is(closeTo(Double.MAX_VALUE, EPS)));
    }
    @Test
    public void testCreateSimpleMinMaxObject () {
        MinMaxSimple both = new MinMaxSimple(1.2, 3.4);
        assertThat(both.getMaxT(), is(closeTo(3.4, EPS)));
    }

    @Test
    public void testCreateSimpleMinMaxObjectWithOneParameter () {
        MinMaxSimple same = new MinMaxSimple(5.6);
        assertThat(same.getMaxT(), is(closeTo(5.6, EPS)));
    }
}
