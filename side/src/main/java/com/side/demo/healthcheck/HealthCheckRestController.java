package com.side.demo.healthcheck;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckRestController {

	
	@GetMapping("/healthcheck")
	private String Hello()
	{
		return "hello side";
	}
}
