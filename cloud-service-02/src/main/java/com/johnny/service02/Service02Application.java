package com.johnny.service02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wjq
 * date:  2019/9/2 16:13
 * description: Service02Application
 **/
@EnableDiscoveryClient
@EnableFeignClients("com.johnny")
@SpringBootApplication(scanBasePackages = "com.johnny")
public class Service02Application {

    public static void main(String[] args) {
        SpringApplication.run(Service02Application.class, args);
    }
}
