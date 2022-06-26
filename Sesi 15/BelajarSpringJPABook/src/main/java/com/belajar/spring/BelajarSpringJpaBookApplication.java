package com.belajar.spring;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.belajar.spring.model.Book;
import com.belajar.spring.model.BookCategory;
import com.belajar.spring.model.Course;
import com.belajar.spring.model.Student;
import com.belajar.spring.repository.BookCategoryRepository;
import com.belajar.spring.repository.BookRepository;
import com.belajar.spring.repository.CourseRepository;
import com.belajar.spring.repository.StudentRepository;

@SpringBootApplication
public class BelajarSpringJpaBookApplication implements CommandLineRunner {
	private final Logger LOG = LoggerFactory.getLogger(BelajarSpringJpaBookApplication.class);
	
	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private BookCategoryRepository bookCategoryRepository;

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringJpaBookApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// Menambahkan buku ke database
		/*Book book1 = new Book();
		book1.setTitle("Menari Bersama Pelangi");
		book1.setWriter("Siapa Aja Boleh");
		book1.setIsbn("IS-20220613");
		
		Book book2 = new Book();
		book2.setTitle("Menari Bersama Guntur");
		book2.setWriter("Siapa Aja Boleh");
		book2.setIsbn("IS-20220614");
		
		bookRepository.save(book1);
		bookRepository.save(book2);*/

		// Menampilkan buku berdasarkan filter
		/*List<Book> books = bookRepository.findAll();
		LOG.info("Books : " + books);

		final String writer = "Siapa Aja Boleh";
		List<Book> books1 = bookRepository.findAllByWriter(writer);
		LOG.info("Books : " + books1);

		final String isbn = "IS-20220613";
		Book book = bookRepository.findByIsbn(isbn);
		LOG.info("Book : " + book);

		final String title = "Menari Bersama Guntur";
		Book book1 = bookRepository.findByTitle(title);
		LOG.info("Book : " + book1);

		List<Book> books2 = bookRepository.findAllQueryNative();
		LOG.info("Book : " + books2);

		List<Book> books3 = bookRepository.findAllByWriterQueryNative(writer);
		LOG.info("Books : " + books3);*/

		// Menambahkan kategori buku ke database
		/*BookCategory bookCategory = bookCategoryRepository.save(new
		BookCategory("Programming", new Book("Java 1", "Teten N.", "SEI92002"), new
		Book("Java 2", "Teten N.", "UEOEI829")));
		LOG.info("BookCategory : " + bookCategory);*/

		// Menambahkan student ke database
		Student student = new Student("Bagoes Okta", 15);
		// Save student ke database
		studentRepository.save(student);

		// Menambahkan 3 course ke database
		Course course1 = new Course("Beginning Spring Boot", 12, 1500);
		Course course2 = new Course("Spring Reactive", 8, 800);
		Course course3 = new Course("Basic Microservices", 9, 100);
		// Save course ke database
		courseRepository.saveAll(Arrays.asList(course1, course2, course3));
		// Menambahkan courses ke student
		student.getCourses().addAll(Arrays.asList(course1, course2, course3));
		// Update student
		studentRepository.save(student);
	}
}
