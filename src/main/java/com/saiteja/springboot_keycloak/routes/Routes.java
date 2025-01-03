package com.saiteja.springboot_keycloak.routes;

import org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions;
import org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration
public class Routes {

    @Bean
    public RouterFunction<ServerResponse> productServiceRoute() {
        return GatewayRouterFunctions.route("product_service")
                .route(RequestPredicates.path("/api/product"), HandlerFunctions.http("http://localhost:9091"))
                .build();
    }

    @Bean
    public RouterFunction<ServerResponse> getProductService() {
        return GatewayRouterFunctions.route("product_service")
                .route(RequestPredicates.path("/api/product/{id}"), HandlerFunctions.http("http://localhost:9091"))
                .build();
    }

}
