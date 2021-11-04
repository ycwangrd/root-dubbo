package com.huayanginfo.dubbo.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author ycwangrd
 * @since 2021-07-02
 */
// 开启基于注解的dubbo功能
@EnableDubbo
@SpringBootApplication
@EntityScan(basePackages = {
        "com.huayanginfo.dubbo.model",
        "com.huayanginfo.dubbo.dto",
        "com.huayanginfo.dubbo.vo"
})
public class ConsumerApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ConsumerApplication.class);
    }
}
