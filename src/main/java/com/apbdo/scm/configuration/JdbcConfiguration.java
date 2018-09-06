package com.apbdo.scm.configuration;

import org.jdbi.v3.core.Jdbi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JdbcConfiguration {

    @Bean
    Jdbi jdbiFactory(@Value("${spring.datasource.url}") String url,
                     @Value("${spring.datasource.username}") String username,
                     @Value("${spring.datasource.password}") String password) {

        return Jdbi.create(url, username, password);
    }
}
