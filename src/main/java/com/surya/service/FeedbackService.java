package com.surya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surya.model.Feedback;
import com.surya.repo.FeedbackRepo;

@Service
public class FeedbackService {
	
	@Autowired
    private  FeedbackRepo feedbackRepository;

  
    public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    public List<Feedback> getAllFeedbacks() {
        return (List<Feedback>) feedbackRepository.findAll();
    }
}
