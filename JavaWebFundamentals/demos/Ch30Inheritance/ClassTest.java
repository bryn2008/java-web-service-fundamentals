package training;

import org.junit.Test;

import java.io.File;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class ClassTest {
    static final double EPS = 1e-4;

    @Test
    public void testResultOfObservationCsvFileMeanValue() throws Exception {
        ObservationFile obs = new ObservationFile(new File("observations.csv"));
        assertThat(obs.mean(), is(closeTo(10.5958, EPS)));
    }

    @Test
    public  void testUseOfSimpleEnum() {
        Temperature t = Temperature.CELSIUS;
        assertEquals("CELSIUS", t.toString());
        assertSame(Temperature.CELSIUS, Temperature.valueOf("CELSIUS"));

    }

    @Test
    public  void testUseOfExtendedEnum() {
        TemperatureScale scale = TemperatureScale.CELSIUS;
        assertEquals("C", scale.SCALE);
        assertEquals("C", scale.getScale());
    }

}
