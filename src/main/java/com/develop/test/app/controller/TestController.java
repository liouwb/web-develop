package com.develop.test.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by colanlove on 2016/11/28.
 */
@Controller
public class TestController {

    @RequestMapping("/")
    public String test() {
        return "index";
    }

}
