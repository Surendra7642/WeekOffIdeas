package com.surya.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.surya.model.RegistrationForm;

@Repository
public interface RegisterRepo extends JpaRepository<RegistrationForm, Integer> {
//	@Query(value="select email from RegistrationForm")
//	Optional<RegistrationForm> findByEmail(String email);
	// Optional<RegistrationForm> findByPassword(String password);
	public
	Optional<RegistrationForm> findByEmail(String email);

		
		Optional<RegistrationForm> findByMobile(long mobile);
		
}