package dummy.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@AllArgsConstructor
@NoArgsConstructor
public class Service1 {

    @Autowired
    Service2 lo2;

    public void run() {
        try {
            MDC.put("uuid", String.valueOf(UUID.randomUUID()));
            log.info("starting execution");
            lo2.run();
        } finally {
            MDC.remove("uuid");
        }
    }

}
