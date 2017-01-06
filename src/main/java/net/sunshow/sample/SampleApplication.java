package net.sunshow.sample;

import net.sunshow.sample.main.config.MainInitConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;

/**
 * author: sunshow.
 */
@Import(MainInitConfig.class)
@EnableAutoConfiguration
public class SampleApplication implements CommandLineRunner {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Thread.currentThread().join();
    }
}
