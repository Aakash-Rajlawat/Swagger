package com.aakash.nepalairlines.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class openApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Nepal Airlines API")
                        .version("1.0")
                        .description("API documentation for the Nepal Airlines ticket booking system"));

    }
}
