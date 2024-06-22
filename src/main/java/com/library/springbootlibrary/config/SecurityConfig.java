package com.library.springbootlibrary.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.headers(headers -> headers
				.contentSecurityPolicy("default-src 'none'; img-src 'self' data: blob:; worker-src 'self' blob:"))
				.csrf(csrf -> csrf.disable()) // Disable CSRF if not needed
				.authorizeRequests(authorize -> authorize.anyRequest().permitAll());

		return http.build();
	}

	@Bean
	public WebSecurityCustomizer webSecurityCustomizer() {
		return (web) -> web.ignoring().antMatchers("/ignore1", "/ignore2");
	}
}
