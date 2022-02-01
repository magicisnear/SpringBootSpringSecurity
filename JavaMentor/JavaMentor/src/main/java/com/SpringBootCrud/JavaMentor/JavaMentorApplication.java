package com.SpringBootCrud.JavaMentor;

import com.SpringBootCrud.JavaMentor.Repository.UserRepository;
import com.SpringBootCrud.JavaMentor.UserService.UserService;
import com.SpringBootCrud.JavaMentor.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaMentorApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaMentorApplication.class, args);
	}

}
