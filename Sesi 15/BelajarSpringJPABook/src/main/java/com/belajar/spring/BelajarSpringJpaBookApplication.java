package com.belajar.spring;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.belajar.spring.model.Book;
import com.belajar.spring.repository.BookRepository;

@SpringBootApplication
public class BelajarSpringJpaBookApplication implements CommandLineRunner {
	private final Logger LOG = LoggerFactory.getLogger(BelajarSpringJpaBookApplication.class);
	
	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringJpaBookApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Book book1 = new Book();
		book1.setTitle("Menari Bersama Pelangi");
		book1.setWriter("Siapa Aja Boleh");
		book1.setIsbn("IS-20220613");
		
		Book book2 = new Book();
		book2.setTitle("Menari Bersama Guntur");
		book2.setWriter("Siapa Aja Boleh");
		book2.setIsbn("IS-20220614");
		
		bookRepository.save(book1);
		bookRepository.save(book2);

		List<Book> books = bookRepository.findAll();
		LOG.info("Books : " + books);
	}

}
