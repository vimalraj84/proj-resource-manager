package com.vimal.rs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vimal.rs.service.CheckService;

@RestController
@RequestMapping(path = "mgr")
public class ResourceMgrController {
	
	@Autowired
	private CheckService checkService; 

	@GetMapping(path = "check")
	@ResponseBody
	public String checkResourceMgrMod() {
		
		checkService.check();
		
		return "Welcome ! Registration Module is up and running";
	}
}
