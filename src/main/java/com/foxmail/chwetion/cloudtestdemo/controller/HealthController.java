package com.foxmail.chwetion.cloudtestdemo.controller;

import com.foxmail.chwetion.cloudtestdemo.context.RuntimeContext;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    @ResponseBody
    public String healthz() {
        return "health";
    }

    @ResponseBody
    @PostMapping("/{status}")
    public String setHealth(@PathVariable boolean status) {
        RuntimeContext.setHealth(status);
        return "set health status to " + status;
    }
}
