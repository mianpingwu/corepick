package com.wump.dao.user;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wump.dao.AbstractDao;
import com.wump.model.Member;

@Repository
public class MemberDaoImpl extends AbstractDao implements MemberDao {

	public List<Member> getAllMember() {
		
		String sql = "select * from member";
		List<Member> members = jdbcTemplate.queryForList(sql, Member.class);
		return members;
	}
	
}
