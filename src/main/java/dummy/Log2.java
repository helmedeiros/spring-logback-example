package dummy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Log2 {

    Logger logger = LoggerFactory.getLogger(Log2.class);

    public void main() {
        try {
            MDC.put("process", "import");
            logger.info("staring importing");

        } finally {
            MDC.remove("process");
        }
        logger.info("importing done");
    }

}
