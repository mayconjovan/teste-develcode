package com.maycon.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maycon.domain.User;
import com.maycon.repositories.UserRepository;

@Service
public class DBService {

	@Autowired
	private UserRepository userRepository;
	
	public void instantiateTestDataBase() throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		User user1 = new User(null, "John", sdf.parse("12/12/2000"), "c:/photos");
		User user2 = new User(null, "Travolta", sdf.parse("05/11/1980"), "c:/photos");
		User user3 = new User(null, "Elon", sdf.parse("03/07/1987"), "c:/photos");
		User user4 = new User(null, "Musk", sdf.parse("05/11/1973"), "c:/photos");

		userRepository.saveAll(Arrays.asList(user1, user2, user3, user4));
	}
}
