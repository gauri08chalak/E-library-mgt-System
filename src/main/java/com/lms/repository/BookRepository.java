package com.lms.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.model.Book;



public interface BookRepository extends JpaRepository<Book, Integer>{

	//@Query("from Book a where a.bookName like %:c%")
//	List<Books> findByBookName(@Param("c") String bookName);
//	
//	List<Books> findByPublication(String publication);
}
