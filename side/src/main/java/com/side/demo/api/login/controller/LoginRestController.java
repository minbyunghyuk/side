package com.side.demo.api.login.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.side.demo.api.login.model.LoginVo;
import com.side.demo.api.login.service.LoginService;
import com.side.demo.common.model.ResultVo;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RequiredArgsConstructor
@RequestMapping(path = "/login")
@RestController
public class LoginRestController {

	
	private final LoginService loginservice;
	
	
	
	/**
	 * @param loginMap Id,password
	 * @param httpServletRequest IP info Save
	 * @return loginVo
	 */
	@GetMapping("/signin")
	public ResponseEntity<ResultVo> SignIn(Map<String,String> loginMap ,HttpServletRequest httpServletRequest) {
		return loginservice.SignIn(loginMap, httpServletRequest);
		
	}
	
	
	
	
}
