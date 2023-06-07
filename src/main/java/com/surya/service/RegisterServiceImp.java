package com.surya.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder;
import com.surya.model.RegistrationForm;
import com.surya.repo.RegisterRepo;
@Service
public class RegisterServiceImp implements RegisterService {
	@Autowired
	private RegisterRepo repo;

	@Override
	public RegistrationForm saveRegister(RegistrationForm reg1) {
		if(reg1.getPassword().equals(reg1.getConfirm_Password()))
		{
			
		}
		else
		{
			return null;
			
		}
		RegistrationForm r1=repo.save(reg1);
		return r1;
		
	}
	@Override
	public void deleteReg(Integer id)
	{
		repo.deleteById(id);
	}
	public RegistrationForm getOne(Integer id,String password) {
		RegistrationForm r2=repo.findById(id).get();
		return r2;
		
	}
	public List<RegistrationForm> getAll()
	{
		List<RegistrationForm> r3=repo.findAll();
		return r3;
	}
	@Override
	public RegistrationForm update(RegistrationForm form) {
		RegistrationForm rg=null;
		Optional<RegistrationForm> op = repo.findById(form.getId());
		if(op.isPresent())
		{
			rg= repo.save(form);
		}
		else
		{
			rg= repo.save(form);
		}
		return rg;
	}

}
