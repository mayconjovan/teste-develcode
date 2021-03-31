package com.maycon.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.maycon.domain.User;


public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L; 
	
	private Integer id;
	
	@NotEmpty(message="Mandatory filling")
	@Length(min=5, max=80, message="Please insert the name width between 5 and 80 characters.")
	private String name;
	
	private Date birthDate;
	
	@NotEmpty(message="Please insert the picture path system.")
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
