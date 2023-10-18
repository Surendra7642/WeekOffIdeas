package com.surya.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.surya.dto.RegistrationDto;
import com.surya.model.RegistrationForm;
import com.surya.userException.PasswordNotMatchException;
import com.surya.userException.UserExistException;

@Service
public interface RegisterService {
 public RegistrationForm saveRegister(RegistrationDto regDto) throws UserExistException, PasswordNotMatchException;
 public void deleteReg(Integer id);
// public RegistrationForm getOne(Integer id,String password);
 public List<RegistrationForm> getAll();
 public RegistrationForm update(RegistrationForm form);
 

}
