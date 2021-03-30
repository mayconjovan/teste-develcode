package com.maycon.dto;

import java.io.Serializable;
import java.util.Date;

import com.maycon.domain.User;

public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L; 
	
	private Integer id;
	private String name;
	private Date birthDate;
	private String photo;
	
	public UserDTO() {
		
	}
	
	public UserDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
		birthDate = obj.getBirthDate();
		photo = obj.getPhoto();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	

}
