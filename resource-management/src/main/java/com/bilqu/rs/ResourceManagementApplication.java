package com.bilqu.rs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class ResourceManagementApplication {

	private static Logger LOG = LoggerFactory.getLogger(ResourceManagementApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ResourceManagementApplication.class, args);
	}

}

