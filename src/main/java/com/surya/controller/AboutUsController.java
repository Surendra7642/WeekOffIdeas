package com.surya.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.surya.model.AboutUsConfiguration;

@RestController
@RequestMapping("/weekoff")
public class AboutUsController {
	
    @Autowired
    private  AboutUsConfiguration aboutUsConfiguration;


    @GetMapping("/about-us")
    public ResponseEntity<Map<String, String>> getAboutUsDetails() {
        Map<String, String> aboutUsDetails = new HashMap<>();
        aboutUsDetails.put("title", aboutUsConfiguration.getTitle());
        aboutUsDetails.put("description", aboutUsConfiguration.getDescription());
        aboutUsDetails.put("email", aboutUsConfiguration.getEmail());
        return ResponseEntity.ok(aboutUsDetails);
    }
}
