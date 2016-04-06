package training;


import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SortTest {

    private List<String> siUnits = Arrays.asList(
            "meter", "kilogram", "second",
            "Ampere", "Kelvin", "mole", "candela"
    );

    @Test
    public void testCaseInsensitiveComparator() {
        siUnits.sort(new IgnoreCaseComparator());
        assertThat(siUnits.indexOf("Ampere"), is(0));
        assertThat(siUnits.indexOf("second"), is(6));
    }

    @Test
    public void testPrivateClassCaseInsensitiveComparator() {
        siUnits.sort(new IgnoreCase());
        assertThat(siUnits.indexOf("Ampere"), is(0));
        assertThat(siUnits.indexOf("second"), is(6));
    }

    @Test
    public void testAnonymousClassCaseInsensitiveComparator() {
        siUnits.sort(new Comparator<String>() {
            @Override
            public int compare(String lhs, String rhs) {
                if (lhs == null || rhs == null) {
                    throw new IllegalArgumentException("IgnoreCaseComparator cannot compare against null");
                }
                return lhs.toLowerCase().compareTo(rhs.toLowerCase());
            }
        });
        assertThat(siUnits.indexOf("Ampere"), is(0));
        assertThat(siUnits.indexOf("second"), is(6));
    }

    private static class IgnoreCase implements Comparator<String> {
        @Override
        public int compare(String lhs, String rhs) {
            if (lhs == null || rhs == null) {
                throw new IllegalArgumentException("IgnoreCaseComparator cannot compare against null");
            }
            return lhs.toLowerCase().compareTo(rhs.toLowerCase());
        }
    }
}
