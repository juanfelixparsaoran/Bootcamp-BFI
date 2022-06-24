package com.belajar.spring.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.spring.entity.Book;

public interface BookRepository extends JpaRepository <Book,Long>{
}
