package com.example.bossplugin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.bossplugin.mapper")
public class BossPlugInApplication {

    public static void main(String[] args) {
        SpringApplication.run(BossPlugInApplication.class, args);
    }

}
