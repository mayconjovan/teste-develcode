package com.maycon;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.maycon.domain.User;
import com.maycon.repositories.UserRepository;

@SpringBootApplication
public class TestDevelcodeApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(TestDevelcodeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		User user1 = new User(null, "John","12/12/2000","c:/photos");
		User user2 = new User(null, "Travolta","5/11/1980","c:/photos");
		
		userRepository.saveAll(Arrays.asList(user1, user2));
	}
}
