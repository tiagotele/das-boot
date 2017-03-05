package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tiago on 03/03/17.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "Das boot, reporting for duty!";
    }
}
