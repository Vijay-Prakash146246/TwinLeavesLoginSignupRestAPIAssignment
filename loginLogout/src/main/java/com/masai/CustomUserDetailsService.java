package com.masai;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService
{
	private UserRepository userRepository;

	public CustomUserDetailsService(UserRepository userRepository) 
	{
		this.userRepository = userRepository;
	}

	
	
	@Override
    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException 
	{
		//we have required to write logic here for it 
		return null;
    }
	

	
}
