package com.mtmslt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

//import java.util.List;

@SpringBootApplication
@RestController
@Component
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}