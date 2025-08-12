package com.xxx.xplatform.config.internal;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
@RequiredArgsConstructor
public class RestTemplateConfig {

    private final ObjectMapper objectMapper;

    @Bean(name = "restTemplate")
    public RestTemplate restTemplate() {

        return new RestTemplateBuilder()
                .defaultHeader("Content-Type", "application/json")
                .defaultHeader("Accept", "application/json")
                .messageConverters(new MappingJackson2HttpMessageConverter(objectMapper))
                .build();
    }
}
