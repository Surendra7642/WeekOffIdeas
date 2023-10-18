package com.surya.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surya.dto.RegistrationDto;
import com.surya.model.RegistrationForm;
//import com.surya.model.RegistrationForm;
import com.surya.repo.RegisterRepo;
import com.surya.userException.PasswordNotMatchException;
import com.surya.userException.UserExistException;
@Service
public class RegisterServiceImp implements RegisterService {
	@Autowired
	private RegisterRepo repo;
	
	
//	@Override
//	public RegistrationForm saveRegister(RegistrationDto regDto) {
//	  RegistrationForm reg=new RegistrationForm();
//	  
//	  reg.setName(regDto.getName());
//	  reg.setMobile(regDto.getMobile());
//	  reg.setEmail(regDto.getEmail());
//	  reg.setPassword(regDto.getPassword());
//	  reg.setAddress(regDto.getAddress());
//	  return repo.save(reg);
//	}
	
	
	
	@Override
	public RegistrationForm saveRegister(RegistrationDto regDto) throws UserExistException, PasswordNotMatchException {
		  RegistrationForm reg=new RegistrationForm();
	
	if(repo.findByEmail(regDto.getEmail()).isPresent() && repo.findByMobile(regDto.getMobile()).isPresent())
	{

		throw new UserExistException("you are already registered");
	}
	else
	{  
		if(regDto.getPassword().equals(regDto.getConfirm_Password()))
	      {
		
		
		reg.setName(regDto.getName());
		  reg.setMobile(regDto.getMobile());
		  reg.setEmail(regDto.getEmail());
		  reg.setPassword(regDto.getPassword());
		  reg.setAddress(regDto.getAddress());
		  return repo.save(reg);
	      }
		
		else
		{
			 throw new PasswordNotMatchException("your Password and ConfirmPassword are not same");
		}
		
	  }
	
	
	}

	
	public RegistrationForm saveRegister1(RegistrationDto regDto) {
		
		
		RegistrationForm reg=new RegistrationForm();
		  
		  reg.setName(regDto.getName());
		  reg.setMobile(regDto.getMobile());
		  reg.setEmail(regDto.getEmail());
		  reg.setPassword(regDto.getPassword());
		  reg.setAddress(regDto.getAddress());
	     if(reg.getPassword().equals(reg.getConfirm_Password()))
		{
			
		}
		else
		{
			return null;
			
		}
		RegistrationForm r1=repo.save(reg);
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