package com.distribuida.appbooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AppBooksApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppBooksApplication.class, args);
    }

}
