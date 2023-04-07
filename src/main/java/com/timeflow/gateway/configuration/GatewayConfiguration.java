package com.timeflow.gateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {

	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p.path("/get")
                                 .filters(f -> f
                                         .addRequestHeader("Hello", "World")     //Chamada site com header
                                         .addRequestParameter("Hello", "World")) //e aqui, junto nessa chamada, passa parâmetros
					.uri("http://httpbin.org:80"))
				.route(p -> p.path("/somewhere/**")
					.uri("lb://api-java8"))
				.route(p -> p.path("/persons/**")
					.uri("lb://report-java8"))
				.route(p -> p.path("/theEndpoint/**")
					.uri("lb://report-java8"))
				.build();
	}
}
