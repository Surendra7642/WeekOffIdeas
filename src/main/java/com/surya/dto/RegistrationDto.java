package com.surya.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class RegistrationDto {
	
	@Size(min=4,message="user name must be 4 char")
	@NotNull(message = "user name must not be empty")
	private String name;
	
	//@Pattern(regexp="^\\d{10}$",message = "invalid mobile no. entered")
	private long mobile;
	
	@NotNull
	@Email(message = "Email aadress is not valid")
	private String email;
	@Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$",message = " password should contains at least eight characters, including at least one number and includes both lower and uppercase letters and special characters ")
	private String password;
	
	private String confirm_Password;
	
	@NotNull(message = " Adress must not be emprty ")
	private String address;

	public RegistrationDto() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirm_Password() {
		return confirm_Password;
	}

	public void setConfirm_Password(String confirm_Password) {
		this.confirm_Password = confirm_Password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public RegistrationDto(
			@Size(min = 4, message = "user name must be 4 char") @NotNull(message = "user name must not be empty") String name,
			long mobile, @NotNull @Email(message = "Email aadress is not valid") String email,
			@Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$", message = " password should contains at least eight characters, including at least one number and includes both lower and uppercase letters and special characters ") String password,
			String confirm_Password, @NotNull(message = " Adress must not be emprty ") String address) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		this.confirm_Password = confirm_Password;
		this.address = address;
	}

	@Override
	public String toString() {
		return "RegistrationDto [name=" + name + ", mobile=" + mobile + ", email=" + email + ", password=" + password
				+ ", confirm_Password=" + confirm_Password + ", address=" + address + "]";
	}
	

}