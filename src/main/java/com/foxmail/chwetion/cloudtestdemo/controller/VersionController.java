package com.foxmail.chwetion.cloudtestdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/version")
public class VersionController {

    @Value("${version}")
    private String version;

    @GetMapping
    @ResponseBody
    public String getVersion() {
        return "current version: " + version;
    }
}
