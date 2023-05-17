package com.iesp.tecback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class SupermercadoApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		SpringApplication.run(SupermercadoApplication.class, args);
	}

}
