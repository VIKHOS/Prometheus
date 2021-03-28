package com.vikhos.learnPrometheus.Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PromController {

    @RequestMapping("/type")
    public String HelloWorld(@RequestParam String greeting) {

        return greeting == "" ? "hello world" : greeting;
    }

}
