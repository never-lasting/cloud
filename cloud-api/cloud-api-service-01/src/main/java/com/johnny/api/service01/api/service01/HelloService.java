package com.johnny.api.service01.api.service01;

import com.johnny.api.service01.api.service01.factory.HelloServiceFallBackFactory;
import com.johnny.common.core.constant.ServiceNameDefination;
import com.johnny.common.core.dto.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @author wjq
 * date:  2019/9/2 16:01
 * description: HelloService
 **/
@FeignClient(value = ServiceNameDefination.SERVICE_01, fallbackFactory = HelloServiceFallBackFactory.class)
public interface HelloService {

    @GetMapping("/hello")
    R<Map<String, Object>> hello();


}
