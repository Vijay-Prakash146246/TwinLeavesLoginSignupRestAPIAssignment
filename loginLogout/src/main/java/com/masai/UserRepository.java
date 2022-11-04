package com.masai;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Long> 
{
	Optional<User>findByEmail(String email);
	Optional<User> findByUsernameOrEmail(String Username ,String email);
	Optional<User>findByUsername(String Username);
	Boolean existsByUsername(String username);
	Boolean existsByEmail(String email);
}
