package com.surya.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.surya.model.PlacesInfo;

public interface PlacesService {
	public PlacesInfo saveplaces(MultipartFile file, String placeName, String description,String location);
	public List<PlacesInfo> getPlaces();

}
