package com.mtmslt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}

// going for SpringBoot tutorial coz wow


//    @GetMapping("/greet")
//    public GreetResponse greet() {
//        GreetResponse respons = new GreetResponse(
//                "Hello Matome ",
//                List.of("Java", "Python", "JavaScript"),
//                new Person("Matome", 25, 100_000)
//        );
//        return respons;
//    }
//
//record Person(String name, int age, double savings) {
//
//}
//
//record GreetResponse(
//        String greet,
//        List<String> favProgrammingLanguages,
//        Person person
//) {}
//
