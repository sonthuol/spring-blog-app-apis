package com.blog.blogappapis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.blogappapis.payloads.ApiResponse;
import com.blog.blogappapis.payloads.CategoryDto;
import com.blog.blogappapis.services.CategoryService;

import jakarta.validation.Valid;

/**
 * Category Controller
 * 
 * Author: Thuol-S
 */
@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * Get all category
     * 
     * @return array object category
     */
    @GetMapping
    public ResponseEntity<List<CategoryDto>> getAllCategory() {
        return ResponseEntity.ok(this.categoryService.getAllCategory());
    }

    /**
     * Get category by id
     * 
     * @param categoryId category id
     * @return a object category
     */
    @GetMapping("/{categoryId}")
    public ResponseEntity<CategoryDto> getCategoryById(@PathVariable("categoryId") Integer categoryId) {
        return ResponseEntity.ok(this.categoryService.getCategoryById(categoryId));
    }

    /**
     * Create category
     * 
     * @param categoryDto a category dto
     * @return a object information category
     */
    @PostMapping
    public ResponseEntity<CategoryDto> createCategory(@Valid @RequestBody CategoryDto categoryDto) {
        CategoryDto createCategoryDto = this.categoryService.createCategory(categoryDto);
        return new ResponseEntity<CategoryDto>(createCategoryDto, HttpStatus.CREATED);
    }

    /**
     * Update information of a category by id
     * 
     * @param categoryDto a category dto
     * @param categoryId  a category id
     * @return a object information category
     */
    @PutMapping("/{categoryId}")
    public ResponseEntity<CategoryDto> updateCategory(@Valid @RequestBody CategoryDto categoryDto,
            @PathVariable("categoryId") Integer categoryId) {
        CategoryDto updateCategoryDto = this.categoryService.updateCategory(categoryDto, categoryId);
        return ResponseEntity.ok(updateCategoryDto);
    }

    /**
     * Delete category by id
     * 
     * @param categoryId category id
     * @return message category deleted successfully
     */
    @DeleteMapping("/{categoryId}")
    public ResponseEntity<ApiResponse> deleteCategory(@PathVariable("categoryId") Integer categoryId) {
        this.categoryService.deleteUser(categoryId);
        return new ResponseEntity<ApiResponse>(new ApiResponse("Category deleted successfully", true), HttpStatus.OK);
    }

}
