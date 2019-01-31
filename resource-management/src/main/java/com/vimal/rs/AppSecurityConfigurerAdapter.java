package com.vimal.rs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.ldap.core.support.LdapContextSource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


//our own configuration
@Configuration
//@EnableWebSecurity is need if we disable the default security configuration.
//Need if we’re overriding the default behavior using a WebSecurityConfigurerAdapter.
@EnableWebSecurity
public class AppSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

	@Value("${spring.security.user.name:default}")
	private String user;
	@Value("${spring.security.user.password:default}")
	private String password;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.inMemoryAuthentication()
		.withUser("usr1")
		.password("password")
		.roles("USER")
		.and()
		.withUser("admin")
		.password("admin")
		.roles("USER", "ADMIN");
	}

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//		.authorizeRequests()
//		.antMatchers("/mgr**" ).authenticated()
//		.antMatchers("/search**" ).authenticated()
//		.antMatchers("/welcome**" ).authenticated()
//		.antMatchers( "/index**" ).authenticated()
//		.anyRequest()
//		.authenticated()
//		.and()
//		.httpBasic()
//		.and()
//        .csrf()
//            .disable()
//        .rememberMe();
//	}
	
	
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/admin/**" );
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
