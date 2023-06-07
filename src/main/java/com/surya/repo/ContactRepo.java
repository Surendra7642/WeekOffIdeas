package com.surya.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.surya.model.ContactForm;
@Repository
public interface ContactRepo extends JpaRepository<ContactForm, String> {

}
