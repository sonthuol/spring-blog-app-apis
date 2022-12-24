package com.blog.blogappapis.services;

import java.util.List;

import com.blog.blogappapis.payloads.CategoryDto;

public interface CategoryService {

    List<CategoryDto> getAllCategory();

    CategoryDto getCategoryById(Integer categoryId);

    CategoryDto createCategory(CategoryDto categoryDto);

    CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

    void deleteUser(Integer categoryId);
}
