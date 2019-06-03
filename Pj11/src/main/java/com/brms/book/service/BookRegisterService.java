package com.brms.book.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.brms.book.Book;
import com.brms.book.dao.BookDao;

public class BookRegisterService {

	@Autowired
	private BookDao bookDao;

	// 프로퍼티에 @Autowired 어노테이션이 있기 때문에 디폴트 생성자를 명시해준다.
	public BookRegisterService() {
		System.out.println("BookRegisterService 생성자");
	}
	
	public void register(Book book) {
		bookDao.insert(book);
	}
	
	public void initMethod() {
		System.out.println("BookRegisterService initMethod()");
	}
	
	public void destroyMethod() {
		System.out.println("BookRegisterService destroyMethod()");
	}
}