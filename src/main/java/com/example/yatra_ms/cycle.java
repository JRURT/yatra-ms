package com.example.yatra_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cycle {
    @GetMapping("/cycle")
    public String getData() {return  "Please book your cycle ticket from yatra app on 35% discount" ; }
}