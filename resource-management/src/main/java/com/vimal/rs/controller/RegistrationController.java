package com.vimal.rs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "reg")
public class RegistrationController {
	
	@GetMapping(path = "check")
	@ResponseBody
	public String checkRegMod() {
		return "Welcome ! Registration Module is up and running";
	}

}
