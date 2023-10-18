package com.surya.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table
public class PlacesInfo {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String placeName;
	    private String description;
	    private String location;
		@Lob
		@Column(columnDefinition = "MEDIUMBLOB")
		private String placeImage;
		public PlacesInfo() {
			super();
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getPlaceName() {
			return placeName;
		}
		public void setPlaceName(String placeName) {
			this.placeName = placeName;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getPlaceImage() {
			return placeImage;
		}
		public void setPlaceImage(String placeImage) {
			this.placeImage = placeImage;
		}
		
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
	
		public PlacesInfo(Long id, String placeName, String description, String location, String placeImage) {
			super();
			this.id = id;
			this.placeName = placeName;
			this.description = description;
			this.location = location;
			this.placeImage = placeImage;
		}
		@Override
		public String toString() {
			return "PlacesInfo [id=" + id + ", placeName=" + placeName + ", description=" + description
					+ ", placeImage=" + placeImage + "]";
		}
		
		


}
