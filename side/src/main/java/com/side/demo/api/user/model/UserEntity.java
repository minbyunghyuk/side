package com.side.demo.api.user.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@Table(name = "side_user", catalog = "side_project")
@Getter
public class UserEntity {

	@Id
	@Column(name = "index")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long index;

	@Column(name = "user_id")
	String userId;

	@Column(name = "password")
	String password;

	@Column(name = "token")
	String token;

	@Column(name = "phone_number")
	String phoneNumber;

	@Column(name = "email")
	String email;

}
