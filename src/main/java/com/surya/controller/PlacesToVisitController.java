package com.surya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.surya.model.PlacesInfo;
import com.surya.service.PlacesServiceImp;

@RestController
public class PlacesToVisitController {
	@Autowired
	private PlacesServiceImp service;

	@PostMapping("/savePlaces")

	public String saveImage(@RequestParam MultipartFile file, @RequestParam String placetName,
			@RequestParam String description, @RequestParam String location) {
		PlacesInfo pl1 = service.saveplaces(file, placetName, description, location);

		String mes = null;
		if (pl1 != null) {
			mes = "image is uploaded successfully";
		} else {
			mes = "uploda image failed";
		}
		return mes;

	}
	@GetMapping("/getPlaces")
	public List<PlacesInfo> getAll()
	{
		List<PlacesInfo> pv=service.getPlaces();
		return pv;
	}

}
