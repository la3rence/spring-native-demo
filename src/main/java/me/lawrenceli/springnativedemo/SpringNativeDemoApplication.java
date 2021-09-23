package me.lawrenceli.springnativedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringNativeDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringNativeDemoApplication.class, args);
    }

}

@RestController
class NativeController {

    private static final Logger log = LoggerFactory.getLogger(NativeController.class);

    @GetMapping("/")
    public String hello() {
        log.info("GET /");
        return "Hello, Spring Native!";
    }
}
