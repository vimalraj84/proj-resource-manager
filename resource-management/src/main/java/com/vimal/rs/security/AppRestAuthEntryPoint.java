package com.vimal.rs.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

// if the user is not authenticated all requests should simply fail with a 401 UNAUTHORIZED status code.
// Spring Security handles this automatic triggering of the authentication process with the concept of an Entry Point 
// this is a required part of the configuration, and can be injected via the authenticationEntryPoint method.
@Component
public class AppRestAuthEntryPoint implements AuthenticationEntryPoint  {

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		
		//new custom entry point to simply return 401 when triggered
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
	}

}
