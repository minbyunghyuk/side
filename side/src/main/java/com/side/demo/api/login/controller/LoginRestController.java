package com.side.demo.api.login.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.side.demo.api.login.service.LoginService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RequiredArgsConstructor
@RequestMapping(path = "/login")
@RestController
public class LoginRestController {

	
	private final LoginService loginservice;
	
	
	
	
	
	
}
