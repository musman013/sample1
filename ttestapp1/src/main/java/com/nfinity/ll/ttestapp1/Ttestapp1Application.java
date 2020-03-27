package com.nfinity.ll.ttestapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class Ttestapp1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ttestapp1Application.class, args);
	}

}

