package com.vimal.rs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vimal.rs.service.CheckService;

@RestController
@RequestMapping(path = "admin")
public class AppAdminController {
	
	private static final Logger LOG = LoggerFactory.getLogger(AppAdminController.class);
	
	@Autowired
	private CheckService checkService; 
	
	@GetMapping(path = "check")
	@ResponseBody
	public String checkAdmin() {
		checkService.check();
		return "Welcom to Admin Mode";
		
	}
	
	

}
