package training;

import org.h2.api.ErrorCode;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class BasicTest {
    @Test
    public void testThatTheJavaVersionIs8() throws Exception {
        String version = System.getProperty("java.version");
        assertTrue(version.startsWith("1.8"));
    }

    @Test
    public void testThatTheJavaVersionIs7or8() throws Exception {
        String version = System.getProperty("java.version");
        assertThat(version, is(anyOf(startsWith("1.7"), startsWith("1.8"))));
    }

    @Test(expected = NumberFormatException.class)
    public void testIntegerParseThrowsNumberFormatExceptionOnInvalidValue() {
        int n = Integer.parseInt("invalid");
    }

    @Test
    public void testCannotConnectToInvalidSQLDatabaseServer() {

        try {
            Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/database;IFEXISTS=TRUE");
        } catch (SQLException e) {
            assertEquals(ErrorCode.CONNECTION_BROKEN_1, e.getErrorCode());
        }
    }

    private List<String> names;

    @Before
    public void setup() {
        names = new ArrayList<>();
        for (String name : new String[]{"Tom", "Dick", "Harry", "thomas", "richard", "henry"}) {
            names.add(name);
        }
    }

    @Test
    public void verifyStringSortSortsLetterCaseSensitive() {
        assertEquals(6, names.size());
        Collections.sort(names);
        assertThat(names.get(0), is("Dick"));
        assertThat(names.get(5), is("thomas"));
    }

    @Test
    public void test2Divided3GiveApproximateValue() {
        double twoThirds = 2.0/3.0;
        assertThat(twoThirds, is(closeTo(0.66666, 1e-5)));
    }

}
