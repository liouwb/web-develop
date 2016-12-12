package com.develop.test.app.controller;

import com.develop.test.app.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by colanlove on 2016/11/28.
 */
@RestController
@Api(value = "测试系统", description = "用于测试swagger ui是否可用")
public class TestController {

    @Autowired
    TestService testService;

    /**
     * 测试接口
     *
     * @param name 用户名
     * @param age  年龄
     * @return 组合字符串
     */
    @ApiOperation(value = "测试接口", notes = "只是为了测试用的接口")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", required = true, value = "你的名字", dataType = "string", paramType = "query", defaultValue = "Jack"),
            @ApiImplicitParam(name = "age", required = true, value = "你的年龄", dataType = "string", paramType = "query", defaultValue = "25"),
    })
    public String test(String name, int age) {

        testService.method();

        return "Hello, " + name + ", age is " + age;
    }

}
