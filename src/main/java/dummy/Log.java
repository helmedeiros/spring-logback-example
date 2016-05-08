package dummy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Log {

    private static Logger logger = LoggerFactory.getLogger(Log.class);

    public static void main(String[] args) {
        try {
            MDC.put("username", "Rohan");
            logger.debug("Rohan logs in");
            new Log2().main();
        } finally {
            MDC.remove("username");
        }
    }

}
