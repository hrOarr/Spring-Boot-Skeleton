package com.teamdemo.springbootskeleton.repository.databaseOne;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    private final JdbcTemplate jdbcTemplate;

    public UserRepository(@Qualifier("oneJdbcTemplate") JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
}