package com.huayanginfo.dubbo.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author ycwangrd
 * @since 2021-07-02
 */
// 开启基于注解的dubbo功能
@EnableDubbo
@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.huayanginfo.dubbo.provider.repository"})
@EntityScan("com.huayanginfo.dubbo.model")
public class ProviderApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ProviderApplication.class);
    }
}
