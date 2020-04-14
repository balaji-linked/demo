package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Publisher;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long>{

	Publisher findByCode(String code);
	
}
