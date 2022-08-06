package com.ronyreyna.DeclaracionIva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DeclaracionIvaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeclaracionIvaApplication.class, args);
	}

}
