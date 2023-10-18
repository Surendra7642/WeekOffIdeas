package com.surya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.surya.model.AuthenticationRequest;
import com.surya.model.AuthenticationResponse;
import com.surya.model.RegistrationForm;
import com.surya.security.MyUserDetailsService;
import com.surya.service.LoginServiceImp;
import com.surya.util.JwtUtil;

@RestController
public class LoginController {
	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtUtil jwtTokenUtil;

	@Autowired
	private MyUserDetailsService userDetailsService;
	
	@Autowired
	private LoginServiceImp service;
	@GetMapping("/getOne/{email}/{password}")
	public RegistrationForm getOne(@PathVariable String  email,@PathVariable String password)
	{
		RegistrationForm rf1=service.getOne(email, password);
		return rf1;
	}
	
	
	
	
	@RequestMapping(value = "/token", method = RequestMethod.GET)
//	@GetMapping("/token")-->Post also is valid 
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest)
			throws Exception {

		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
					authenticationRequest.getUsername(), authenticationRequest.getPassword()));
		} catch (BadCredentialsException e) {
			throw new Exception("Incorrect username or password", e);
		}

		final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());

		final String jwt = jwtTokenUtil.generateToken(userDetails);

		return ResponseEntity.ok(new AuthenticationResponse(jwt));
	}

}

	
