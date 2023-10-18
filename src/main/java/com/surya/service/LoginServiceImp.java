package com.surya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surya.model.RegistrationForm;
import com.surya.repo.LoginRepo;
@Service
public class LoginServiceImp implements LoginService {
	@Autowired
	private LoginRepo repo;

	@Override
	public RegistrationForm getOne(String email, String password) {
		RegistrationForm rgf=repo.findByEmail(email).get();
		return rgf;
	}

}
