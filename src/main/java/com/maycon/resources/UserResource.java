package com.maycon.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maycon.domain.User;
import com.maycon.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findUser(@PathVariable Integer id) {
		User obj = service.getUser(id);
		return ResponseEntity.ok().body(obj);
	}

}
