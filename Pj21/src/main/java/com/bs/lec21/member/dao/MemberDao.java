package com.bs.lec21.member.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.bs.lec21.member.Member;

@Repository
public class MemberDao implements IMemberDao {

	private String dirver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin@localhost:1521:xe";
	private String userid = "scott";
	private String userpw = "tiger";

	private Connection conn = null;
	private PrepareState pstmt = null;
	private ResultSet rs = null;


	private HashMap<String, Member> dbMap;
	
	public MemberDao() {
		dbMap = new HashMap<String, Member>();
	}
	
	@Override
	public Map<String, Member> memberInsert(Member member) {
		
		dbMap.put(member.getMemId(), member);
		return dbMap;
		
	}

	@Override
	public Member memberSelect(Member member) {
		
		Member mem = dbMap.get(member.getMemId());
		return mem;
		
	}

	@Override
	public Member memberUpdate(Member member) {
		
		dbMap.put(member.getMemId(), member);
		return dbMap.get(member.getMemId());
		
	}

	@Override
	public Map<String, Member> memberDelete(Member member) {
		
		dbMap.remove(member.getMemId());
		return dbMap;
		
	}

}
