package com.savewater.reactbackend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")                          // allow CORS for all endpoints
                        .allowedOrigins("http://localhost:3000")    // allow your React app's origin
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // allowed HTTP methods
                        .allowedHeaders("*");                        // allow all headers
            }
        };
    }
}
