package com.side.demo.api.login.service;

import java.util.Arrays;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.side.demo.api.login.model.LoginVo;
import com.side.demo.api.user.model.UserEntity;
import com.side.demo.api.user.repo.UserRepository;
import com.side.demo.common.model.ResultVo;
import com.side.demo.common.model.ResultVo.ResultVoBuilder;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LoginService {

	/**
	 * @param loginMap           Id,password
	 * @param httpServletRequest IP info Save
	 * @return loginVo
	 */

	final UserRepository userRepository;


	public ResponseEntity<ResultVo> SignIn(Map<String, String> loginMap, HttpServletRequest httpServletRequest) {
		

		UserEntity userEntity = userRepository.findByUserId("test");
		// TODO 사용자인증은 뭘로?.. OAtuh SAML?
		return ResponseEntity.ok(ResultVo.success("Login 하였습니다.",LoginVo.of(userEntity.getUserId(),userEntity.getPhoneNumber(), null, null, null)));
		
	}
	
	
	

}
