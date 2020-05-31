package com.johnny.cloud.oauth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wjq
 * date:  2019/11/13 16:57
 * description: OauthApplication
 **/
@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.johnny.cloud.oauth.dao")
public class OauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthApplication.class, args);
    }
}
