package com.blog.blogappapis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.blogappapis.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
