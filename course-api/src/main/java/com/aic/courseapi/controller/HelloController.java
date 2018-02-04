package com.aic.courseapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.http.MediaType.*;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = GET, produces = TEXT_PLAIN_VALUE)
    public String sayHi() {
        return "Hi";
    }

}
