package com.vimal.rs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "mgr")
public class ResourceMgrController {

	@GetMapping(path = "check")
	@ResponseBody
	public String checkResourceMgrMod() {
		return "Welcome ! Registration Module is up and running";
	}
}
