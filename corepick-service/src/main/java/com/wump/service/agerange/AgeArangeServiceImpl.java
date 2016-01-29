package com.wump.service.agerange;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wump.dao.user.AgeRangeDao;
import com.wump.model.AgeRange;

@Service
public class AgeArangeServiceImpl implements AgeArangeService {
	
	@Autowired
	private AgeRangeDao ageRangeDao;

	public List<AgeRange> getAllAgeRange() {
		return ageRangeDao.getAllAgeRange();
	}

}
