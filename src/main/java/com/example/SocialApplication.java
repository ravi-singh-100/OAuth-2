
package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SocialApplication {


	public static void main(String[] args) {
		SpringApplication.run(SocialApplication.class, args);
		System.out.println("Server has been started");
	}

}
