package com.surya.errorHandling;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.surya.userException.PasswordNotMatchException;
import com.surya.userException.UserExistException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
    @ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String>handleException(MethodArgumentNotValidException ex){
		
		Map<String, String> errMap=new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(error ->{
			errMap.put(error.getField(), error.getDefaultMessage());
		});
		
		return errMap	;
	}
    @ExceptionHandler(UserExistException.class)
	public Map<String, String> handleException(UserExistException ex){
		
		Map<String,String> errorMap=new HashMap<>();
		errorMap.put("error message", ex.getMessage());
		return errorMap;
	}
    
    @ExceptionHandler(PasswordNotMatchException.class)
   	public Map<String, String> handleException(PasswordNotMatchException ex){
   		
   		Map<String,String> errorMap=new HashMap<>();
   		errorMap.put("error message", ex.getMessage());
   		return errorMap;
   	}

}