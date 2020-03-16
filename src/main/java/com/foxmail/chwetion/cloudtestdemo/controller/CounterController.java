package com.foxmail.chwetion.cloudtestdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/counter")
public class CounterController {

    private Random random = new Random();

    @GetMapping("/add")
    @ResponseBody
    public String add() {
        double x = random.nextDouble();
        double y = random.nextDouble();
        return "random number x is " + x + " and random number y is " + y + " and result number of x+y is " + (x + y);
    }
}
