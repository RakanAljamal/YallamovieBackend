package com.rest.demo.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HerokuRest {
@RequestMapping("/")
    public String showHome(){
    return "Hello-heroku";
}
}
