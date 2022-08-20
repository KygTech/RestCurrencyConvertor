package com.example.currencyProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class CurrencyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyProjectApplication.class, args);
	}

}
