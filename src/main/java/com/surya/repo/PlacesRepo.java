package com.surya.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.surya.model.PlacesInfo;
@Repository
public interface PlacesRepo extends JpaRepository<PlacesInfo, Long> {

}
