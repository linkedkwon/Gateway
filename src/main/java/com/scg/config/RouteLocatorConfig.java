package com.scg.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RouteLocatorConfig {

    /**
     * Basic API Routing
     */
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder rlb){
        return rlb
                .routes()
                    .route(routeSpec -> routeSpec
                        .path("/order/**")
                        .uri("http://localhost:8001")
                    )
                    .route(routeSpec -> routeSpec
                        .path("/detail/**")
                        .uri("http://localhost:8002")
                    )
                    .route(routeSpec -> routeSpec
                            .path("/search/**")
                            .uri("http://localhost:8003")
                    )
                    .route(routeSpec -> routeSpec
                            .path("/auth/**")
                            .uri("http://localhost:8004")
                    )
                .build();
    }
}