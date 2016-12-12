package com.develop.test.app.service.Impl;

import com.develop.model.WebTestTable;
import com.develop.test.app.mapper.WebTestTableMapper;
import com.develop.test.app.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by colanlove on 2016/11/28.
 */

@Service
public class TestServiceImpl implements TestService {

    private Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    @Autowired
    WebTestTableMapper webTestTableMapper;

    @Override
    public void method() {

        List<WebTestTable> list = webTestTableMapper.getAll();

        for (WebTestTable webTestTable : list) {
            logger.info(webTestTable.getId() + "\t" + webTestTable.getName() + "\t" + webTestTable.getAge());
        }

    }
}
