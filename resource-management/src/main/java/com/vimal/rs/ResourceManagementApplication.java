package com.vimal.rs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vimal.rs.service.CheckService;

@SpringBootApplication
public class ResourceManagementApplication {

	private static Logger LOG = LoggerFactory.getLogger(ResourceManagementApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ResourceManagementApplication.class, args);
	}

}

