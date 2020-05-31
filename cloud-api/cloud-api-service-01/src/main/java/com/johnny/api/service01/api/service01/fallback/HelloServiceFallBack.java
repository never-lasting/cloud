package com.johnny.api.service01.api.service01.fallback;

import com.johnny.api.service01.api.service01.HelloService;
import com.johnny.common.core.constant.ReturnCodeEnum;
import com.johnny.common.core.dto.R;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author wjq
 * date:  2019/12/13 14:20
 * description: HelloServiceFallBack
 **/
@Slf4j
@Setter
public class HelloServiceFallBack implements HelloService {

    private Throwable cause;

    @Override
    public R<Map<String, Object>> hello() {
        log.error("HelloService.hello 请求失败:{}", cause);
        return R.buildFail(ReturnCodeEnum.SERVER_ERROR);
    }
}
