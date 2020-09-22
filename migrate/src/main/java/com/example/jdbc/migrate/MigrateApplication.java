package com.example.jdbc.migrate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class MigrateApplication {

    public static void main(String[] args) {
        SpringApplication.run(MigrateApplication.class, args);
    }

}
