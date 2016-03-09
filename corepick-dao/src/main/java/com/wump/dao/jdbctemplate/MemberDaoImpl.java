package com.wump.dao.jdbctemplate;

import org.springframework.stereotype.Repository;

import com.wump.dao.AbstractDao;

@Repository
public class MemberDaoImpl extends AbstractDao implements MemberDao {

//	public List<Member> getAllMember() {
//		
//		String sql = "select * from member";
//		List<Member> members = jdbcTemplate.queryForList(sql, Member.class);
//		return members;
//	}
	
}
