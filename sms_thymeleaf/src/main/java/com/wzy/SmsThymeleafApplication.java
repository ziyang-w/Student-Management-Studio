package com.wzy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//该类为main类，用于启动Spring Boot项目
@SpringBootApplication
@MapperScan("com.wzy.dao")
public class SmsThymeleafApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {

        SpringApplication.run(SmsThymeleafApplication.class, args);
    }

    @Override//为了打包springboot项目
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }
}
