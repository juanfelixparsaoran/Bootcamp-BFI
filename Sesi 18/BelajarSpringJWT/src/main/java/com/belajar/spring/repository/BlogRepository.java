package com.belajar.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.belajar.spring.model.Blog;

import java.util.List;

@Repository
public interface BlogRepository extends JpaRepository<Blog,Integer> {

    // custom query to search to blog post by title or content
    List<Blog> findByTitleContainingOrContentContaining(String text, String textAgain);

}
