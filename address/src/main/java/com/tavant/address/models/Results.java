package com.tavant.address.models;

import lombok.Data;

@Data
public class Results {
	private String pincode;

	private String city;

	private String subLocality;

	private String latitude;

	private String houseNumber;

	private String locality;

	private String poi;

	private String type;

	private String houseName;

	private String street;

	private String subSubLocality;

	private String district;

	private String state;

	private String village;

	private String subDistrict;

	private String place_id;

	private String longitude;

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPincode() {
		return this.pincode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return this.city;
	}

	public void setSubLocality(String subLocality) {
		this.subLocality = subLocality;
	}

	public String getSubLocality() {
		return this.subLocality;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getHouseNumber() {
		return this.houseNumber;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getLocality() {
		return this.locality;
	}

	public void setPoi(String poi) {
		this.poi = poi;
	}

	public String getPoi() {
		return this.poi;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public String getHouseName() {
		return this.houseName;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreet() {
		return this.street;
	}

	public void setSubSubLocality(String subSubLocality) {
		this.subSubLocality = subSubLocality;
	}

	public String getSubSubLocality() {
		return this.subSubLocality;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return this.state;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getVillage() {
		return this.village;
	}

	public void setSubDistrict(String subDistrict) {
		this.subDistrict = subDistrict;
	}

	public String getSubDistrict() {
		return this.subDistrict;
	}

	public void setPlace_id(String place_id) {
		this.place_id = place_id;
	}

	public String getPlace_id() {
		return this.place_id;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLongitude() {
		return this.longitude;
	}

}
