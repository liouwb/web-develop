package com.develop.test.app.service.Impl;

import com.develop.test.app.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by colanlove on 2016/11/28.
 */

@Service
public class TestServiceImpl implements TestService {

    private Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    @Override
    public void method(String name, int age) {

        logger.info("Hello, " + name + ", age is " + age);
    }
}
