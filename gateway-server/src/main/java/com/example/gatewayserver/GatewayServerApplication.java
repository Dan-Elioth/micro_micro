package com.example.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.GatewayFilterSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.gateway.route.builder.UriSpec;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class GatewayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServerApplication.class, args);
    }
   /*   @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder, Function<GatewayFilterSpec, UriSpec> brutalCorsFilters) {
        return builder.routes()
                .route(p -> p.path("/users/**").filters(brutalCorsFilters).uri("https://localhost:9443"))
                .route(p -> p.path("/greet/**").filters(brutalCorsFilters).uri("https://localhost:9445"))
                .route(p -> p.path("/categoria/**").filters(brutalCorsFilters).uri("https://localhost:4200"))
                .build();
    }

  @Bean
    Function<GatewayFilterSpec, UriSpec> brutalCorsFilters() {
        return f -> f
                .setResponseHeader("Access-Control-Allow-Origin", "*")
                .setResponseHeader("Access-Control-Allow-Methods", "*")
                .setResponseHeader("Access-Control-Expose-Headers", "*");
    }
*/
}
