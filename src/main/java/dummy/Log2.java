package dummy;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

@Slf4j
public class Log2 {

    public void main() {
        try {
            MDC.put("process", "import");
            log.info("staring importing");

        } finally {
            MDC.remove("process");
        }
        log.info("importing done");
    }

}
