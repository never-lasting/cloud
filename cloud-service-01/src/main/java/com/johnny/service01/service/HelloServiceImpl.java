package com.johnny.service01.service;

import com.johnny.api.service01.api.service01.HelloService;
import com.johnny.common.core.dto.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class HelloServiceImpl implements HelloService {

    @Value("${greetings}")
    private String greetings;

    @GetMapping("/hello")
    public R<Map<String, Object>> hello(){
        Map<String, Object> map = new HashMap<>();
        map.put("Hello", greetings);
        log.info("invoked");
        return R.buildSuccess(map);
    }

}
