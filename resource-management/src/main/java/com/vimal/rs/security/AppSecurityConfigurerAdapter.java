package com.vimal.rs.security;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


//our own configuration
@Configuration
//@EnableWebSecurity is need if we disable the default security configuration.
//Need if we’re overriding the default behavior using a WebSecurityConfigurerAdapter.
@EnableWebSecurity

//For a non-Spring Boot application, we can extend the AbstractSecurityWebApplicationInitializer and pass our config class in its constructor:
public class AppSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

	@Value("${spring.security.user.name:default}")
	private String user;
	@Value("${spring.security.user.password:default}")
	private String password;
	
	@Autowired
	private AppRestAuthEntryPoint appRestAuthEntryPoint; 
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.inMemoryAuthentication()
		.withUser("usr1")
		//.password("{noop}password")
		.password(encoder().encode("password")).roles("USER")
		.and()
		.withUser("admin")
		.password(encoder().encode("admin")).roles("USER","MGR", "ADMIN")
		.and()
		.withUser("mgr")
		.password(encoder().encode("mgr")).roles("USER", "MGR");
	}
	
	@Bean
	public PasswordEncoder  encoder() throws NoSuchAlgorithmException {
	    return new BCryptPasswordEncoder(4, SecureRandom.getInstanceStrong());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		
//		 http
//		    .csrf().disable()
//		    .exceptionHandling()
//		    .authenticationEntryPoint(appRestAuthEntryPoint)
//		    .and()
//		    .authorizeRequests()
//		    //The /search/** pattern is accessible to any authenticated user. 
//		    //then, /mgr/** will only be accessible to ADMIN role users.
//		    //then, /admin/** will only be accessible to ADMIN role users.
//		    .antMatchers( "/index**" ).authenticated()
//		    .antMatchers("/search/**" ).hasAnyRole("USER","MGR", "ADMIN")
//			.antMatchers("/reg/**" ).hasAnyRole("USER","MGR", "ADMIN")
//			.antMatchers("/mgr/**" ).hasRole("MGR")
//		    .antMatchers("/admin/**").hasRole("ADMIN")
//		    .and()
//		    .formLogin()
////		    .successHandler(mySuccessHandler)
////		    .failureHandler(myFailureHandler)
//		    .and()
//		    .logout();
	}
	
	
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/search/**" );
    }
    
    
    //Set up you open ldap to try these steps

//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .eraseCredentials(false)
//                .ldapAuthentication()
//                .userDnPatterns("racfid={0},profiletype=USER")
//                .groupSearchFilter("(racfid={0})")
//                .contextSource(getContextSource());
//    }

//    private LdapContextSource getContextSource() {
//        LdapContextSource source = new LdapContextSource();
//        source.setUrl("LDAP URL");
//        source.setBase("LDAP_BASE" );
//        source.setUserDn( "LDAP_BIND_USER_DN");
//        source.setPassword("LDAP_BIND_USER_PW" );
//        source.afterPropertiesSet();
//        return source;
//    }
	
}
