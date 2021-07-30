package com.a0521.auth.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.a0521.auth.models.User;
import com.a0521.auth.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

	User save(UserRegistrationDto registrationDto);

//	UserDetails loadedUserByUsername(String username) throws UsernameNotFoundException;
}
