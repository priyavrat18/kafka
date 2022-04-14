package com.dev.spring.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;


@SpringBootApplication
@EnableKafka
public class SpringBoot2ApacheKafkaTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot2ApacheKafkaTestApplication.class, args);
    }

}
