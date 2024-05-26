package com.punyadev.my_spring_boot_app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class IndexController {

    @GetMapping("")
    public String index() {
        log.info("hello world");
        return "Hello World";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        log.info("hello {}", name);
        return "Hello " + name;
    }
}
