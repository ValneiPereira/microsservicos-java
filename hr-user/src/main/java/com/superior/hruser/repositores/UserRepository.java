package com.superior.hruser.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.superior.hruser.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email); 
}
