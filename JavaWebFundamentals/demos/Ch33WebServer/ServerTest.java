package training;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith( SpringJUnit4ClassRunner.class )
@SpringApplicationConfiguration(classes = {Main.class})
@ActiveProfiles({"production","json"})
public class ServerTest {
    @Autowired
    BasicRestController rest;

    @Test
    public void testSimpleHelloEndpointReturnsHelloREST(){
        assertEquals("Hello REST", rest.hello());
    }
}
