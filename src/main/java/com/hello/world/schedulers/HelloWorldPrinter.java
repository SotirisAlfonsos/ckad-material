package com.hello.world.schedulers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldPrinter {

    private static Logger LOGGER = LoggerFactory.getLogger(HelloWorldPrinter.class);

    @Value("${value.app}")
    private String value;

    @Scheduled(fixedDelay = 60000)
    public void helloWorldPrinter() {
        LOGGER.info("HELLO WORLD");
    }

    @Scheduled(fixedDelay = 1000)
    public void valuePrinter() {
        LOGGER.info(value);
    }
}
