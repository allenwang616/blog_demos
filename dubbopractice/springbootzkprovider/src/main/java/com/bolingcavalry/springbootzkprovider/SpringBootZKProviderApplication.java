package com.bolingcavalry.springbootzkprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: 启动类
 * @author: willzhao E-mail: zq2599@gmail.com
 * @date: 2020/10/17 15:14
 */
@SpringBootApplication
@EnableDubbo
public class SpringBootZKProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootZKProviderApplication.class, args);
    }
}
