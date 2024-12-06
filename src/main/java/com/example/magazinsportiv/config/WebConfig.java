package com.example.magazinsportiv.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")               // Permite toate căile API-ului
                .allowedOrigins("http://localhost:3000")  // Permite cereri de la frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Permite metodele HTTP
                .allowedHeaders("*")              // Permite toate headerele
                .allowCredentials(true);          // Permite trimiterea cookie-urilor (dacă este necesar)
    }
}


