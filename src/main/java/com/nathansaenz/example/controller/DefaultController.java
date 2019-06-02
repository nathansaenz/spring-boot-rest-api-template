package com.nathansaenz.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DefaultController {
    Logger logger = LoggerFactory.getLogger(DefaultController.class);

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }


    @RequestMapping("/greeting")
public String greeting() {
    long start = System.currentTimeMillis();
    long duration = System.currentTimeMillis() - start;
    logger.info("/greeting call took " + duration +  "ms");
    return "Greetings from Spring Boot";

}
}