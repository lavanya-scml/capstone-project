package com.tavant.address.models;

import java.util.List;

import lombok.Data;
@Data
public class Response {

	private List<Results> results;

	private String version;

	private int responseCode;

	public void setResults(List<Results> results) {
		this.results = results;
	}

	public List<Results> getResults() {
		return this.results;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getVersion() {
		return this.version;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public int getResponseCode() {
		return this.responseCode;
	}

	

}
