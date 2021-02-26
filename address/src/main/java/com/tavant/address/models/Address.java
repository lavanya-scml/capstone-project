package com.tavant.address.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@Entity(name="Address")
@Table(name="address")
public class Address {
	
	public Address(String houseNumber, String houseName, String poi, String street, String subSubLocality,
			String subLocality, String locality, String village, String subDistrict, String district, String city,
			String state, String pincode, String formattedAddress, String eLoc, String geocodeLevel,
			float confidenceScore) {
		super();
		this.houseNumber = houseNumber;
		this.houseName = houseName;
		this.poi = poi;
		this.street = street;
		this.subSubLocality = subSubLocality;
		this.subLocality = subLocality;
		this.locality = locality;
		this.village = village;
		this.subDistrict = subDistrict;
		this.district = district;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.formattedAddress = formattedAddress;
		this.eLoc = eLoc;
		this.geocodeLevel = geocodeLevel;
		this.confidenceScore = confidenceScore;
	}
	@Id
	private String houseNumber;
	private String houseName;
	private String poi;
	private String street;
	private String subSubLocality;
	private String subLocality;
	private String locality;
	private String village;
	private String subDistrict;
	private String district;
	private String city;
	private String state;
	private String pincode;
	private String formattedAddress;
	private String eLoc;
	private String geocodeLevel;
	private float confidenceScore;
	
	

}

