package com.surya.controller;

import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.surya.model.ContactForm;
import com.surya.service.ContactService;

@RestController
@RequestMapping("/weekoff")
public class ContactController {
	
	@Autowired
	private ContactService service;

	@PostMapping("/contactus")
	public ResponseEntity<String> submitContactUsForm(@RequestBody ContactForm ContactForm) {
		try {
			validateContactUs(ContactForm);
			service.submitContactForm(ContactForm);

			return ResponseEntity.ok("Contact form submitted successfully!");
		} catch (ValidationException e) {
			return ResponseEntity.badRequest().body("Validation error: " + e.getMessage());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error submitting contact form");
		}
	}

	private void validateContactUs(ContactForm contactform) throws ValidationException {
		if (contactform.getName() == null || contactform.getName().isEmpty()) {
			throw new ValidationException("Name is required");
		}
		if (contactform.getEmail() == null || contactform.getEmail().isEmpty()) {
			throw new ValidationException("Email is required");
		}
		if (contactform.getMessage() == null || contactform.getMessage().isEmpty()) {
			throw new ValidationException("Message is required");
		}

	}
}
