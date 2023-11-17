package com.mcService.microService.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestetemplateConfig {
    @Primary
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
