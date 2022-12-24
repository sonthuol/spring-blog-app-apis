package com.blog.blogappapis.payloads;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

    private Integer id;

    @NotEmpty
    @Size(min = 3, max = 100, message = "Title must be min of 5 chars and max of 100 chars!")
    private String categoryTitle;

    @NotEmpty
    private String categoryDescription;
}
