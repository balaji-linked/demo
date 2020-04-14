package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Book;
import com.example.demo.repo.BookRepository;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookRepository bookRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public Iterable<Book> getAllBooks() {
		return bookRepository.findAll();
	}
	
	@RequestMapping(value = "/{isbn}",method=RequestMethod.GET)
	public Book getBook(@PathVariable String isbn) {
		return bookRepository.findBookByIsbn(isbn);
	}
	
}
