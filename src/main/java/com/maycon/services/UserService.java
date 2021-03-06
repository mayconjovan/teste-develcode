package com.maycon.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maycon.domain.User;
import com.maycon.dto.UserDTO;
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

	public User update(User obj) {
		getUser(obj.getId());
		return repository.save(obj);
	}

	public void delete(Integer id) {
		getUser(id);
		repository.deleteById(id);
	}

	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getBirthDate(), objDto.getPhoto());
	}
}
