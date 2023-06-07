package com.surya.service;

import java.util.List;

import com.surya.model.RegistrationForm;

public interface RegisterService {
 public RegistrationForm saveRegister(RegistrationForm reg1);
 public void deleteReg(Integer id);
 public RegistrationForm getOne(Integer id,String password);
 public List<RegistrationForm> getAll();
 public RegistrationForm update(RegistrationForm form);

}
