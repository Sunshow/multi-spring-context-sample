package net.sunshow.sample.contextB.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * author: sunshow.
 */
@Configuration
@ComponentScan("net.sunshow.sample.contextB")
public class ContextBInitConfig {

    @PostConstruct
    public void init() {
        System.out.println("ContextBInitConfig");
    }
}
