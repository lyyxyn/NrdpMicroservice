package com.cebbank.nrdp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class UserController {
    @Value("${name}")
    private String name;

    @RequestMapping("/name")
    private String name() {
        return "aaa"+name;
    }
}
