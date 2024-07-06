package com.examplespringsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.examplespringsecurity.Repository.UserRepository;
import com.examplespringsecurity.entity.Tb_User;

@SpringBootApplication
public class ExamplespringsecurityApplication {

	public static void main(String[] args) {
	 SpringApplication.run(ExamplespringsecurityApplication.class, args);

	}

}
