package com.wump.service.agerange;

import java.util.List;

import com.wump.model.AgeRange;

public interface AgeArangeService {
	
//	public List<AgeRange> getAllAgeRange();
	
	public List<AgeRange> getAllAgeRangeMybatis();
	
	public AgeRange getAgeRange(String ageRangeCode);
}
