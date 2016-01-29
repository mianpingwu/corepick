package com.wump.vo;

import java.io.Serializable;
import java.util.List;

import com.wump.model.Member;

public class AllMembersVo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private List<Member> members;

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}
	
	
}
