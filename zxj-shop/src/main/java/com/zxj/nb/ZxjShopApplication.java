package com.zxj.nb;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.zxj.nb.impl", "com.zxj.nb.repository"})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDubbo
public class ZxjShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZxjShopApplication.class, args);
    }

}
