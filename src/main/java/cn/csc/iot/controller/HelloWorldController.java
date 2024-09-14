package cn.csc.iot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
