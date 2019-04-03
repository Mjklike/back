package com.neuedu.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
@Configuration
public class MyDataSourceConfig {


    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource(){
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName("com.mysql.jdbc.Driver");
        hikariConfig.setJdbcUrl("jdbc:mysql://192.168.254.104:3306/db3?useUnicode=true&characterEncoding=utf8");
        hikariConfig.setUsername("root");
        hikariConfig.setPassword("password");
        hikariConfig.setMaximumPoolSize(20);
        hikariConfig.setMinimumIdle(8);
        return new HikariDataSource(hikariConfig);
    }
}
