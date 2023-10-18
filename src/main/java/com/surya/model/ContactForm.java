package com.surya.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
//@NoArgsConstructor
//@AllArgsConstructor
@Data
@Setter
@Getter
@ToString
public class ContactForm {
	@Id
	@NotNull
	@Column
	@Size(min=5,max=20)
	private String name;
//	@Email
//	@Column
//	@Size(min=1,max=20)
	private String email;
//	@NotEmpty
	private String message;
	public ContactForm() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ContactForm(@NotEmpty(message="name not must be empty") String name, @Email String email, @NotEmpty String message) {
		super();
		this.name = name;
		this.email = email;
		this.message = message;
	}
	@Override
	public String toString() {
		return "ContactForm [name=" + name + ", email=" + email + ", message=" + message + "]";
	}
	 
}
