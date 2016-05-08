package dummy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.UUID;

public class Log {

    private static Logger logger = LoggerFactory.getLogger(Log.class);

    public static void main(String[] args) {
        try {
            MDC.put("uuid", String.valueOf(UUID.randomUUID()));
            logger.debug("starting execution");
            new Log2().main();
        } finally {
            MDC.remove("uuid");
        }
    }

}
