package dummy.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class Service2 {

    public void run() {
        try {
            MDC.put("process", "import");
            log.info("staring importing");

        } finally {
            MDC.remove("process");
        }
        log.info("importing done");
    }

}
