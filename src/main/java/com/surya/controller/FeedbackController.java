package com.surya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.surya.model.Feedback;
import com.surya.service.FeedbackService;

@RestController
@RequestMapping("/feedbacks")
public class FeedbackController {
	@Autowired
	private FeedbackService service;

    @PostMapping("/save")
    public String saveFeedback(@RequestBody Feedback feedback) {
    	Feedback f1=service.saveFeedback(feedback);
    	return "Feedback submitted successfully!";
        
    }
    @GetMapping("/getAll")
    public List<Feedback> getAll()
    {
    	return service.getAllFeedbacks();
    }

}
