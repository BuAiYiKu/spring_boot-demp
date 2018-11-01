package com.fujw.spring_boot.config;

import com.fujw.spring_boot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration:指明当前类为一个配置类
 */
@Configuration
public class MyAppConfig {

    @Bean
    public HelloService helloService(){
        System.out.println("配置类@Bean给容器中添加了组件");
        return new HelloService();
    }
}
