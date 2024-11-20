package com.kltech.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.kltech.service")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConifg.class,MybatisConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}
