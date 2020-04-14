package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Book;

@RepositoryRestResource
public interface BookRepository extends PagingAndSortingRepository<Book, Long>{

	Book findBookByIsbn(String isbn);
	
}
