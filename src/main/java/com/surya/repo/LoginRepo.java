package com.surya.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.surya.model.RegistrationForm;
@Repository
public interface LoginRepo extends JpaRepository<RegistrationForm, Integer> {
	
	Optional<RegistrationForm> findByEmail(String email);
//	RegistrationForm findByPassword(String password);

}
