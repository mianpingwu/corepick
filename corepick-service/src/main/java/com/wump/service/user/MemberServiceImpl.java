package com.wump.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wump.dao.user.MemberDaoImpl;
import com.wump.model.Member;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDaoImpl memberDao;
	
	public List<Member> getAllMembers() {
		return memberDao.getAllMember();
	}

}
