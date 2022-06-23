package com.belajar.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.belajar.spring.entity.Book;
import com.belajar.spring.repository.BookRepository;

@SpringBootApplication
public class BelajarSpringJpaBookApplication implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(BelajarSpringJpaBookApplication.class);

	@Autowired
	private BookRepository bookRepository;
	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringJpaBookApplication.class, args);
	}

//	@Override
	public void run(String... args)throws Exception{
		Book book1 = new Book();
		book1.setTitle("Belajar Spring Boot");
		book1.setIsbn("IS-9009");
		book1.setWriter("Teten Supratna");
		
		Book book2 = new Book();
		book2.setTitle("Belajar Spring Boot 2");
		book1.setIsbn("IS-9010");
		book1.setWriter("Teten Supratna");
		
		bookRepository.save(book1);
		bookRepository.save(book2);
		
		log.info("Berhasil menyimpan "+ book1);
		log.info("Berhasil menyimpan "+ book2);
		

	}
	

}
