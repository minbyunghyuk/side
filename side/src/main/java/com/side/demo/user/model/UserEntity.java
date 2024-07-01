package com.side.demo.user.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
public class UserEntity {

	@Id
	@Column(name="index")
	Long index;
	
	@Column(name="id")
	String userId;
	
	@Column(name="password")
	String password;
	
	@Column(name="token")
	String token;
	
	
	
	
}
