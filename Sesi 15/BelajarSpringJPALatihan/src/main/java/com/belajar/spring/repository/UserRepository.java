package com.belajar.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.spring.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

}

