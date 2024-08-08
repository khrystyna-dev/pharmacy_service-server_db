package com.example.pharmacy;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("com.example.pharmacy")
@EnableEncryptableProperties
public class PharmacyServiceServerDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(PharmacyServiceServerDbApplication.class, args);
    }

}
