package com.maycon.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maycon.domain.User;
import com.maycon.repositories.UserRepository;
import com.maycon.services.exceptions.ObjectNotfoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public User getUser(Integer id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(
				() -> new ObjectNotfoundException("Object not Found! Id: " + id + ", Type: " + User.class.getName()));
	}
	
	public User insert(User obj) {
		obj.setId(null);
		return repository.save(obj);
	}
}
