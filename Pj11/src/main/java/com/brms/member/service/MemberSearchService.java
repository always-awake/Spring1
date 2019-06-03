package com.brms.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.brms.member.Member;
import com.brms.member.dao.MemberDao;

public class MemberSearchService {

	@Autowired
	private MemberDao memberDao;
	
	public MemberSearchService() {
		System.out.println("MemberSearchService 생성자");
	}
	
	public Member searchMember(String mId) {
		return memberDao.select(mId);
	}
	
}