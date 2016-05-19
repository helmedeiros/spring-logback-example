package dummy.controller;

import dummy.service.Service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @Autowired Service1 s;

    @RequestMapping("/")
    public String index() {
        s.run();
        return "Greetings from Spring Boot!";
    }

}