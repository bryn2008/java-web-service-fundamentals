package training;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

@RunWith( SpringJUnit4ClassRunner.class )
@SpringApplicationConfiguration(classes = {Main.class})
@ActiveProfiles("json")
public class ObservationTest {
    static final double EPS = 1e-5;
    
    @Autowired
    private Observations file;

    @Test
    public void testJsonFileHasEntryFor1Jan2000 () {
        MinMax t = file.read(LocalDate.of(2000,1,1));
        assertThat(t.getMaxT(), is(closeTo(8.4, EPS)));
    }
}
