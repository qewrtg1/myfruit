package com.myfruit.pms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/common/hello")
    public String hello(){
        return "common/hello"; // 타임리프가 hello.html로 보내줄 것
    }
}
