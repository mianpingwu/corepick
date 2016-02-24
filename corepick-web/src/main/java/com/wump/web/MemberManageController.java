package com.wump.web;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wump.model.Member;
import com.wump.service.user.MemberService;
import com.wump.vo.AllMembersVo;
import com.wump.vo.TestVo;

@Controller
@RequestMapping("/member")
public class MemberManageController {
	
	private Logger logger = Logger.getLogger(MemberManageController.class.getName());
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public @ResponseBody TestVo test() {
		
		logger.info("MemberManageController.test() execute ...");
		String retMsg = "Hello, This is a test! Can you get it? I am here to teach you how to do it.";
		TestVo vo = new TestVo();
		vo.setRetMsg(retMsg);
		return vo;
	}
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public @ResponseBody AllMembersVo retrieveMembers() {
		
		logger.info("MemberManageController.retrieveMembers() execute ...");
		AllMembersVo vo = new AllMembersVo();
		List<Member> members = memberService.getAllMembers();
		vo.setMembers(members);
		return vo;
	}
}
