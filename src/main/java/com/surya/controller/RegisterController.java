package com.surya.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.surya.dto.RegistrationDto;
import com.surya.model.RegistrationForm;
import com.surya.service.RegisterServiceImp;
import com.surya.userException.PasswordNotMatchException;
import com.surya.userException.UserExistException;

@RestController
public class RegisterController {
	@Autowired
	private RegisterServiceImp service;
	
	@PostMapping("/save")
	public String insertRegister(@Valid @RequestBody RegistrationDto rf) throws UserExistException, PasswordNotMatchException
	{
		RegistrationForm msg=service.saveRegister(rf);
		if(msg!=null)
		{
		    return "data saved successfully";
		}
		else
		{
			return "data is not saved";
		}
	}
	
//	@PostMapping("/save2")
//	public String insertRegister1(@Valid@RequestBody RegistrationDto rf)
//	{
//		RegistrationForm msg=service.saveRegister1(rf);
//		if(msg!=null)
//		{
//		    return "data saved successfully";
//		}
//		else
//		{
//			return "data is not saved";
//		}
//	}
	@DeleteMapping("/delete/{id}")
	public void deleteRegister(@PathVariable Integer id)
	{
		service.deleteReg(id);
	}
	//login purpose
//	@GetMapping("/login/{id}/{password}")
//	public RegistrationForm getOne(@PathVariable Integer id,@PathVariable String password)
//	{
//		RegistrationForm rf1=service.getOne(id,password);
//		return rf1;
//	}
	@GetMapping("/getAll")
	public List<RegistrationForm> getAllReg()
	{
		List<RegistrationForm> rf2=service.getAll();
		return rf2;
	}
	@PutMapping("/update")
	public RegistrationForm updateReg(@RequestBody RegistrationForm form)
	{
		return service.update(form);
	}
	
	 

}