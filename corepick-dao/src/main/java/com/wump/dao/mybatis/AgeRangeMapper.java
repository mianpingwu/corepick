package com.wump.dao.mybatis;

import java.util.List;

import com.wump.model.AgeRange;

public interface AgeRangeMapper {
	
	public List<AgeRange> getAllAgeRange();
	
	public AgeRange getAgeRangeById(String ageRangeCode);
}
