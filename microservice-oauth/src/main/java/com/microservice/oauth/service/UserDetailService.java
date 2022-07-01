package com.microservice.oauth.service;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@EnableWebSecurity
public interface UserDetailService {

    UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException;
}
