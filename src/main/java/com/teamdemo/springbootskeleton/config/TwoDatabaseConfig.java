package com.teamdemo.springbootskeleton.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class TwoDatabaseConfig {
    @Bean
    @Primary
    @ConfigurationProperties("spring.two.datasource")
    public DataSource sqlTwoDataSource() {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

    @Bean(name = "twoJdbcTemplate")
    public JdbcTemplate twoJdbcTemplate(@Qualifier("sqlTwoDataSource") DataSource isDataSource){
        return new JdbcTemplate(isDataSource);
    }
}
