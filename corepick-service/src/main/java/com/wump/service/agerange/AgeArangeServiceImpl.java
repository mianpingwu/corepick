package com.wump.service.agerange;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wump.dao.mybatis.AgeRangeMapper;
import com.wump.model.AgeRange;

@Service
public class AgeArangeServiceImpl implements AgeArangeService {
	
	Logger logger = Logger.getLogger(AgeArangeServiceImpl.class);
	
/*	@Autowired
	private AgeRangeDao ageRangeDao;*/
	
	@Autowired
	private AgeRangeMapper ageRangeMapper;

/*	public List<AgeRange> getAllAgeRange() {
		return ageRangeDao.getAllAgeRange();
	}*/

	@Override
	public List<AgeRange> getAllAgeRangeMybatis() {
		
		logger.info("AgeArangeServiceImpl.getAllAgeRangeMybatis execute ...");
		List<AgeRange> rs = ageRangeMapper.getAllAgeRange();
		logger.info("reslut:" + rs);
		return rs;
	}

	@Override
	public AgeRange getAgeRange(String ageRangeCode) {
		
		logger.info("AgeArangeServiceImpl.getAgeRange() execute ...");
		AgeRange ageRange = ageRangeMapper.getAgeRangeById(ageRangeCode);
		logger.info(ageRange.toString());
		return ageRange;
	}

}
