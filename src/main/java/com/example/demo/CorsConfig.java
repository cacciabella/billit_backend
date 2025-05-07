package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(
                    "http://localhost:3000", // URL del frontend in sviluppo
                    "https://billitbackend-production.up.railway.app" // URL del backend in produzione
                )
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Metodi HTTP permessi
                .allowedHeaders("Authorization", "Content-Type", "X-Requested-With", "Accept") // Headers permessi
                .allowCredentials(true); // Consente invio di cookie o header di autenticazione
    }
}
