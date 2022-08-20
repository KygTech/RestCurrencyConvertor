package com.example.currencyProject.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@ConfigurationProperties(prefix = "rest")
@Data

public class ConvertorConfiguration {

    private String baseUrl;

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
