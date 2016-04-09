package com.demo.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Book;
import com.demo.services.BookService;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@RestController
public class BookWebService {

	@Autowired
	private BookService bookService;
	
	@RequestMapping("/getAllBooks")
	public Iterable<Book> getAllBooks(){
		System.out.println("hello "+bookService.getNextBookId());
		return bookService.getAllBooks();
	}
	
	@RequestMapping("/saveBook")
	public boolean saveBook(@RequestParam String name,@RequestParam String authorName){
		Book book=new Book(bookService.getNextBookId(), name, authorName);
		bookService.saveBook(book);
		return true;
	}
}
