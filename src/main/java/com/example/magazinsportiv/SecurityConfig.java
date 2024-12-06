package com.example.magazinsportiv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.List;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .cors(cors -> cors.configurationSource(corsConfigurationSource()))// Dezactivează CSRF (doar pentru testare)
                .authorizeHttpRequests(authz -> authz
                        .anyRequest().permitAll()) // Permite toate cererile pentru testare
                .csrf(csrf -> csrf.disable());

        return http.build();
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(List.of("http://localhost:3000")); // Permite frontend-ul React
        configuration.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE")); // Permite metodele corespunzătoare
        configuration.setAllowedHeaders(List.of("Authorization", "Content-Type")); // Permite antetele corespunzătoare
        configuration.setAllowCredentials(true); // Permite trimiterea de cookie-uri

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration); // Aplică politica CORS pe toate cererile

        return source;
    }
}
