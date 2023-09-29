package io.github.efenglul.serviceLoader.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringExample implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(SpringExample.class);

    @Autowired
    List<SimpleService> simpleServices;

    public static void main(String[] args) {
        SpringApplication.run(SpringExample.class, args);

    }

    public void run(final String... strings) throws Exception {
        for (SimpleService simpleService : simpleServices) {
            log.info("Echo: " + simpleService.echo(strings[0]));
        }
    }
}
