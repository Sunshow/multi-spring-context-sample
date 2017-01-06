package net.sunshow.sample.contextA.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * author: sunshow.
 */
@Configuration
@ComponentScan("net.sunshow.sample.contextA")
public class ContextAInitConfig {

    @PostConstruct
    public void init() {
        System.out.println("ContextAInitConfig");
    }

}
