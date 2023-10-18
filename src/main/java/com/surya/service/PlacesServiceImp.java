package com.surya.service;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.surya.model.PlacesInfo;
import com.surya.repo.PlacesRepo;
@Service
public class PlacesServiceImp implements PlacesService {
	@Autowired
	private PlacesRepo repo;

	@Override
	public PlacesInfo saveplaces(MultipartFile file, String placeName, String description,String location) {
		PlacesInfo p1=new PlacesInfo();
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		if(fileName.contains(".."))
		{
			System.out.println("not a a valid file");
		}
		try {
			p1.setPlaceImage(Base64.getEncoder().encodeToString(file.getBytes()));
		}
		catch(Exception e){
			e.printStackTrace();
		}
		p1.setPlaceName(placeName);
		p1.setDescription(description);
		p1.setLocation(location);
		PlacesInfo p2=repo.save(p1);
		return p2;
	}

	
	public List<PlacesInfo> getPlaces() {
		List<PlacesInfo> p3=repo.findAll();
		return p3;
	}
	

}
