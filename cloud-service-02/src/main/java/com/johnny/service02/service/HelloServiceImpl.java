package com.johnny.service02.service;

import com.johnny.api.service01.api.service01.HelloService;
import com.johnny.common.core.dto.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author wjq
 * date:  2019/9/2 16:15
 * description: HelloServiceImple
 **/

@RestController
public class HelloServiceImpl {

    private final HelloService helloService;

    @Autowired
    public HelloServiceImpl(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public R<Map<String, Object>> hello() {
        return helloService.hello();
    }
}
