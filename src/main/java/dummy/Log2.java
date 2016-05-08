package dummy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Log2 {

    Logger logger = LoggerFactory.getLogger(Log2.class);

    public void main() {
        try {
            MDC.put("product", "Shampoo");
            logger.info("staring at the screen");

        } finally {
            MDC.remove("product");
        }
        logger.info("browsing done");
    }

}
