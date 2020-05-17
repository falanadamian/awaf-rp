package com.falana.awafrp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

//@EnableZuulProxy
@SpringBootApplication
@EnableCaching
//@Configuration
public class AwafRpApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwafRpApplication.class, args);
    }
}
