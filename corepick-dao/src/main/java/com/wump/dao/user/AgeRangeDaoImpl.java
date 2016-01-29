package com.wump.dao.user;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.wump.dao.AbstractDao;
import com.wump.model.AgeRange;


@Repository
public class AgeRangeDaoImpl extends AbstractDao implements AgeRangeDao {

	public List<AgeRange> getAllAgeRange() {

		String sql = "select * from age_range";

		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		Iterator<Map<String, Object>> iterator = list.iterator();
		List<AgeRange> ageRangeList = new ArrayList<AgeRange>();
		AgeRange ageArange = null;
		while (iterator.hasNext()) {
			Map<String, Object> map = (Map<String, Object>) iterator.next();
			ageArange = new AgeRange();
			ageArange.setAgeRangeCode((String) map.get("age_range_code"));
			ageArange.setAgeFrom((Integer) map.get("age_from"));
			ageArange.setAgeTo((Integer) map.get("age_to"));
			ageArange.setDescription((String) map.get("description"));
			ageRangeList.add(ageArange);
		}
		return ageRangeList;
	}

}
