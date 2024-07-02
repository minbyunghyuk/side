package com.side.demo.api.login.model;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class LoginVo {

	String Id;
	String name;
	String phoneNumber;
	String email;
	String LastLoginTime;

	@Builder
	public LoginVo(String id, String name, String phoneNumber, String email, String lastLoginTime) {
		this.Id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.LastLoginTime = lastLoginTime;
	}

	
	
	public static LoginVo of(String id, String name, String phoneNumber, String email, String lastLoginTime) {
		return LoginVo.builder()
				.id(id)
				.name(name)
				.phoneNumber(phoneNumber)
				.email(email)
				.lastLoginTime(lastLoginTime)
				.build();

	}

}
