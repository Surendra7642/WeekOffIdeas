package com.surya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surya.model.ContactForm;
import com.surya.repo.ContactRepo;

@Service
public class ContactService {
	@Autowired
	private ContactRepo repo;

    public void submitContactForm(ContactForm contactForm) {
    	repo.save(contactForm);
    }
}