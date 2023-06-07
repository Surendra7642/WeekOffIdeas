package com.surya.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.surya.model.Feedback;
@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

}
