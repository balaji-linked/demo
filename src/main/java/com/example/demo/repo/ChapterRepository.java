package com.example.demo.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.domain.Chapter;

@RepositoryRestResource
public interface ChapterRepository extends PagingAndSortingRepository<Chapter, Long>{

	
	
}
