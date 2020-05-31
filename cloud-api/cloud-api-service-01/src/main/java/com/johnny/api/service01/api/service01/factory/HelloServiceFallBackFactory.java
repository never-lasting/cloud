package com.johnny.api.service01.api.service01.factory;

import com.johnny.api.service01.api.service01.HelloService;
import com.johnny.api.service01.api.service01.fallback.HelloServiceFallBack;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author wjq
 * date:  2019/12/13 14:19
 * description: HelloServiceFallBackFactory
 **/
@Component
public class HelloServiceFallBackFactory implements FallbackFactory<HelloService> {

    @Override
    public HelloService create(Throwable cause) {
        HelloServiceFallBack fallBack = new HelloServiceFallBack();
        fallBack.setCause(cause);
        return fallBack;
    }
}
