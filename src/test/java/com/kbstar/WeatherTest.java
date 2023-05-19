package com.kbstar;

import com.kbstar.util.WeatherUtil;
import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@Slf4j
@SpringBootTest
class WeatherTest {

    @Test
    void contextLoads() throws Exception {
        JSONObject result = null;
        result = (JSONObject)WeatherUtil.getWeather3("108");
        log.info(result+"");
    }
}