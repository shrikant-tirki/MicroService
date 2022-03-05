package com.bel.training.jwt.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bel.training.jwt.model.CustomUserBean;
import com.bel.training.jwt.model.User;
import com.bel.training.jwt.repository.UserRepository;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUserName(username)
					  			  .orElseThrow(() -> new UsernameNotFoundException("User with "
					  			  		+ "user name "+ username + " not found"));
		return CustomUserBean.createInstance(user);
	}
}
