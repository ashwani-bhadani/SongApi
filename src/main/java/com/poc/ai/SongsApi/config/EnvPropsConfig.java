package com.poc.ai.SongsApi.config;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnvPropsConfig {
    @Bean
    public Dotenv dotenv() {
        return Dotenv.configure().load();
    }
}
