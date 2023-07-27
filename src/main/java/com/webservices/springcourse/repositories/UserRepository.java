package com.webservices.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.springcourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}