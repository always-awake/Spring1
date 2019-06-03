package com.brms.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.brms.member.Member;
import com.brms.member.dao.MemberDao;

public class MemberRegisterService {

	@Autowired
	private MemberDao memberDao;
	
	public MemberRegisterService() {
		System.out.println("MemberRegisterService 생성자");
	}
	
	public void register(Member member) {
		memberDao.insert(member);
	}
}
