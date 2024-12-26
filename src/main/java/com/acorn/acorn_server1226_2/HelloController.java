package com.acorn.acorn_server1226_2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/data")
    public String hi () {


        return "hi Data!!!  ^^^^^";
    }

}
