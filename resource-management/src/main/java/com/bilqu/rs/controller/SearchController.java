package com.bilqu.rs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bilqu.rs.service.CheckService;

@RestController
@RequestMapping("/search")
public class SearchController {
	
	
	@Autowired
	private CheckService checkService; 
	
	@GetMapping(path = "/check")
	@ResponseBody
	public String checkSearchMod() {
		
		checkService.check();
		
		return "Welcome ! Registration Module is up and running";
	}

}
