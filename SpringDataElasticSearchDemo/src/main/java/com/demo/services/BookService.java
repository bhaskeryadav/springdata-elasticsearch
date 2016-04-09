package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Book;
import com.demo.repository.BookRepository;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@RestController
public class BookService {

	@Autowired
	private BookRepository bookRepo;
	
	@RequestMapping("/getAllBooks")
	public Iterable<Book> getAllBooks(){
		System.out.println("hello");
		return bookRepo.findAll();
	}
}
