package com.kbstar;

import com.kbstar.util.UnUtil;

import lombok.extern.slf4j.Slf4j;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@Slf4j
@SpringBootTest
class UnTest {

    @Test
    void contextLoads() throws Exception {
       String result = null;
        result = UnUtil.getUn();
        log.info(result);
    }


}