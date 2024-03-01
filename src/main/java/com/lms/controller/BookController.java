package com.lms.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;




@RestController

public class BookController {
	
//	@Autowired
//	BookRepository repo;
	
	//private Converter converter;
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/book_register")
	public String bookRegister() {
		return "bookRegister";
	}
		
//		@GetMapping("/get")
//		public List<Books> getValue() {
//			System.out.println(repo.findAll());
//			return repo.findAll();	
//			
			
	
	} 
		
//		@PutMapping("/updateBook/{id}")
//		public Books updateBook(@PathVariable("id") int id, 
//				@Valid @RequestBody Books book)
//		{
//			Books book1 =converter.Books(book);
//			return bookService.updateBook(id, book1);
//		}
	
	


