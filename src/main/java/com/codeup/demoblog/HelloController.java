package com.codeup.demoblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {



        @GetMapping("/hello/{name}")
        @ResponseBody
        public String hello(@PathVariable String name) {
            return "Hello from Spring there " + name + "!";
        }
    }

