package com.siarhei.jpanewtimeapidemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.siarhei.jpanewtimeapidemo")
public class DatabaseConfig {
}
