package com.sakthi.springclaimms;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@Slf4j
@SpringBootApplication
public class Demo22Application {

    public static void main(String[] args) {

        SpringApplication.run(Demo22Application.class, args);
        log.info("Hello World 2");

    }

    @Bean
    RestTemplate restTemplate()
    {
        return new RestTemplate();
    }

}
