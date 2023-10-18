package com.surya.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.surya.model.Feedback;

public interface FeedbackRepo extends PagingAndSortingRepository<Feedback, Integer> {

}
