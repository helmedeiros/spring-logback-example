package dummy;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;

import java.util.UUID;

@Slf4j
public class Log {

    public static void main(String[] args) {
        try {
            MDC.put("uuid", String.valueOf(UUID.randomUUID()));
            log.debug("starting execution");
            new Log2().main();
        } finally {
            MDC.remove("uuid");
        }
    }

}
