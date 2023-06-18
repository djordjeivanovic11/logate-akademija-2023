package com.Logate.SpringBootVjezba.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ExternalPostConfiguration {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
