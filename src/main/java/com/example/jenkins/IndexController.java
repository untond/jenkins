package com.example.jenkins;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/hello")
    public String abc(){
        return "index";
    }
}
