package com.develop.test.app.controller;

import com.develop.test.app.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by colanlove on 2016/11/28.
 */
@Controller
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/hello")
    @ResponseBody
    public String test() {

        testService.method();

        return "test method";
    }

}
