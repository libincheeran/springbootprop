package com.libin.springproperty;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(value = "com.libin.*")
public class SpringpropertyApplication implements CommandLineRunner{

	public static void main(String[] args) {

		SpringApplication.run(SpringpropertyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(" this is from run ");
	}
}
