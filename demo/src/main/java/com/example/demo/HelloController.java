package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//my made packages
import com.example.demo.calculator.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/anith")
    public String anith(){
        return "<h1>Hello Anith!</h1>";
    }

    @GetMapping("/add")
    public String add(@RequestParam double a, @RequestParam double b){
        Add addition = new Add();
        double result = addition.add(a,b);
        return String.valueOf(result);
    }

    @GetMapping("/sub")
    public String sub(@RequestParam double a, @RequestParam double b){
        Sub sub = new Sub();
        double result = sub.sub(a,b);
        return String.valueOf(result);
    }
}