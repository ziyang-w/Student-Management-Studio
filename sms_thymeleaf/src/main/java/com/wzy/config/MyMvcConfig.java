package com.wzy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//如果要扩展SpringMVC，官方建议用@Configuration
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    //视图跳转
    @Override
    public void addViewControllers(ViewControllerRegistry register){
        register.addViewController("/sms").setViewName("/sms/login");   //设置访问/sms请求跳转到/sms/login.html页面

    }


}
