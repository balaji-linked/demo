package com.example.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.example.demo.domain.Address;
import com.example.demo.domain.Book;
import com.example.demo.domain.Customer;
import com.example.demo.domain.Publisher;
import com.example.demo.repo.AddressRepository;
import com.example.demo.repo.BookRepository;
import com.example.demo.repo.ChapterRepository;
import com.example.demo.repo.CustomerRepository;
import com.example.demo.repo.PublisherRepository;

public class StartupRunner implements CommandLineRunner {

	@Autowired
	private PublisherRepository publisherRepository;
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ChapterRepository chapterRepository;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello...");
		//System.out.println(ds);
		Publisher publisher = publisherRepository.findById(1L).get();
		System.out.println("Publisher :");
		System.out.println("===========");
		System.out.println("Name : " + publisher.getName());
		System.out.println("Code : "+ publisher.getCode());
		System.out.println("Published Books : "+ publisher.getBooks());
		System.out.println("Published Id : "+ publisher.getId());
		Book book = bookRepository.findById(1L).get();
		System.out.println("Book :");
		System.out.println("======");
		System.out.println("Name : " + book.getName());
		System.out.println("Isbn : " + book.getIsbn());
		System.out.println("Chapters : " + book.getChapters());
		System.out.println("Find By ISBN : " + bookRepository.findBookByIsbn("1932394419"));
		System.out.println("Address :");
		System.out.println("=========");
		Address address = addressRepository.findById(1L).get();
		System.out.println("Street : " + address.getStreet());
		System.out.println("Customers : " + address.getCustomers());
		System.out.println("Customer :");
		System.out.println("==========");
		Customer customer = customerRepository.findById(1L).get();
		System.out.println("Id no : " + customer.getIdcardno());
		System.out.println("Addresses : " + customer.getAddresses());
		
		
		
		
	}

}
