package com.library.springbootlibrary.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.library.springbootlibrary.entity.Book;


@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:3000")
public interface BookRepository extends JpaRepository<Book,Long> {
	
	Page<Book> findByTitleContaining(@RequestParam("title") String title,Pageable pageable);
	Page<Book> findByCategory(@RequestParam("category") String category,Pageable pageable);
}
