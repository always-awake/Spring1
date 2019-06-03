package com.brms.book;

import com.brms.member.Member;

public class Book {

	// Book 프로퍼티
	private String bNum;
	private String bTitle;
	private boolean bCanRental;
	private Member bMember;

	// 생성자
	public Book(String bNum, String bTitle, boolean bCanRental, Member bMember) {
		this.bNum = bNum;
		this.bTitle = bTitle;
		this.bCanRental = bCanRental;
		this.bMember = bMember;
	}

	// 프로퍼티에 대한 getter, setter
	public String getbNum() {
		return bNum;
	}

	public void setbNum(String bNum) {
		this.bNum = bNum;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public boolean isbCanRental() {
		return bCanRental;
	}

	public void setbCanRental(boolean bCanRental) {
		this.bCanRental = bCanRental;
	}

	public Member getbMember() {
		return bMember;
	}

	public void setbMember(Member bMember) {
		this.bMember = bMember;
	}
	
}