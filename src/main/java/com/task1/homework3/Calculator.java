package com.task1.homework3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {

    @GetMapping(path = "/calculator")
    public String hello(){
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        int sum = num1 + num2;
        return  num1 + "+" + num2 + "=" + sum;
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        int sum = num1 - num2;
        return  num1 + "-" + num2 + "=" + sum;
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        int sum = num1 * num2;
        return  num1 + "*" + num2 + "=" + sum;
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        int sum = num1 / num2;
        return  num1 + "/" + num2 + "=" + sum;
    }
}
