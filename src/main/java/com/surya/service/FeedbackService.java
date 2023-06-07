package com.surya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surya.model.Feedback;
import com.surya.repo.FeedbackRepository;

@Service
public class FeedbackService {
	
	@Autowired
    private  FeedbackRepository feedbackRepository;

  
    public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    public List<Feedback> getAllFeedbacks() {
        return feedbackRepository.findAll();
    }
}
