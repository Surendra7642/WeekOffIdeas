package com.surya.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.surya.model.ContactForm;
import com.surya.service.ContactService;

@RestController
@RequestMapping("/api/contactus")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping
    public ResponseEntity<String> submitContactForm(@RequestBody ContactForm contactForm) {
        contactService.submitContactForm(contactForm);
        return ResponseEntity.ok("Contact form submitted successfully.");
    }
}