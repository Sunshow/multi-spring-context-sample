package net.sunshow.sample.main.config;

import net.sunshow.sample.contextA.config.ContextAInitConfig;
import net.sunshow.sample.contextB.config.ContextBInitConfig;
import net.sunshow.sample.main.component.MainComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * author: sunshow.
 */
@Configuration
@ComponentScan("net.sunshow.sample.main")
public class MainInitConfig {

    @Autowired
    ApplicationContext context;

    @Autowired
    MainComponent mainComponent;

    @PostConstruct
    void init() throws Exception {
        new ParentAnnotationContextFactory(context, ContextAInitConfig.class).getObject();
        new ParentAnnotationContextFactory(context, ContextBInitConfig.class).getObject();
    }
}
