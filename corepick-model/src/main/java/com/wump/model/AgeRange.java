package com.wump.model;

import java.io.Serializable;

public class AgeRange implements Serializable {
	private static final long serialVersionUID = 1L;

	private String ageRangeCode;

	private Integer ageFrom;

	private Integer ageTo;

	private String description;

	public String getAgeRangeCode() {
		return this.ageRangeCode;
	}

	public void setAgeRangeCode(String ageRangeCode) {
		this.ageRangeCode = ageRangeCode;
	}

	public Integer getAgeFrom() {
		return ageFrom;
	}

	public void setAgeFrom(Integer ageFrom) {

		this.ageFrom = ageFrom;
		
	}

	public Integer getAgeTo() {
		return ageTo;
	}

	public void setAgeTo(Integer ageTo) {
		this.ageTo = ageTo;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}