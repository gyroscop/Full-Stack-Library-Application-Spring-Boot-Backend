//package com.library.springbootlibrary.config;
//
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig2 extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//            .headers()
//                .contentSecurityPolicy("default-src 'none'; img-src 'self' data: blob:; worker-src 'self' blob:;")
//                .and()
//            .frameOptions().sameOrigin()
//            .and()
//            .csrf().disable();
//
//        // If you want to disable authentication for testing purposes
//        http
//            .authorizeRequests()
//                .anyRequest().permitAll();
//    }
//}
//
