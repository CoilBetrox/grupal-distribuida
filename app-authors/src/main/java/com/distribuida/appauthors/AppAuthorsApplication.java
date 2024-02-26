package com.distribuida.appauthors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AppAuthorsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppAuthorsApplication.class, args);
    }

    /*
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route(r -> r.path("/authors/**")
                        .filters(f -> f
                                .prefixPath("/api")
                                .addResponseHeader("X-Powered-By", "Gateway Service")
                        ).uri("http://localhost:9092")
                ).build();
    }

     */


}
