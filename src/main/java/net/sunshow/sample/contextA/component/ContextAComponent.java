package net.sunshow.sample.contextA.component;

import net.sunshow.sample.main.component.MainComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * author: sunshow.
 */
@Component
public class ContextAComponent {

    @Autowired
    private MainComponent mainComponent;

    @PostConstruct
    void init() {
        mainComponent.hello();
    }

    public void hello() {
        System.out.println("Hello contextA!");
    }
}
