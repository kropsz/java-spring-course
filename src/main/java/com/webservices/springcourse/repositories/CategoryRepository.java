package com.webservices.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.springcourse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}