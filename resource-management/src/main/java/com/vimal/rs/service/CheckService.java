package com.vimal.rs.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CheckService {
	
	private static final Logger LOG = LoggerFactory.getLogger(CheckService.class);  
	
	public void check() {
		if(LOG.isInfoEnabled())
			LOG.info("Inside check()");
		
		LOG.info("Check->Check->Check->Check->Check->Check->Check->");
		
		if(LOG.isInfoEnabled())
			LOG.info("returing check()");
	}
}
