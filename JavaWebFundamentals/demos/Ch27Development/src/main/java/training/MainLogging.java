package training;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainLogging {

    private static final Logger logger = LoggerFactory.getLogger(MainLogging.class);

    public static void main(String[] args) {
        logger.info("Hello world");
        String name = "world";
        logger.debug("Hello {}", name);
    }
}
