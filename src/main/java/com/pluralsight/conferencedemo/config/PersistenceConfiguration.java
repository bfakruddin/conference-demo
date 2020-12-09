package com.pluralsight.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

    @Bean
    public DataSource dataSource(){
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://localhost:3306/conference_demo");
        dataSourceBuilder.username("root");
        dataSourceBuilder.password("baba");
        System.out.println(" My Custom Datasource bean has been initialized and set");
        return dataSourceBuilder.build()  ;
    }
}
