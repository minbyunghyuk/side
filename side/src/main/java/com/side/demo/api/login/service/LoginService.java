package com.side.demo.api.login.service;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.side.demo.api.login.model.LoginVo;
import com.side.demo.api.user.model.UserEntity;
import com.side.demo.api.user.repo.UserRepository;
import com.side.demo.common.ResultVo;
import com.side.demo.common.ResultVo.ResultVoBuilder;

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

	public ResultVo SignIn(Map<String, String> loginMap, HttpServletRequest httpServletRequest) {
		// TODO Auto-generated method stub

		UserEntity userEntity = userRepository.findByUserId(loginMap.get("userId"));

		LoginVo loginVo = new LoginVo();

		return ResultVo.success("Login 하였습니다.", loginVo);
		
	}

}
