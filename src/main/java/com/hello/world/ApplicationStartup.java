package com.hello.world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ApplicationStartup extends SpringBootServletInitializer {
    public static void main(final String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ApplicationStartup.class, args);
    }
}
