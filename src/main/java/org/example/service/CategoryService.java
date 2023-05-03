package org.example.service;

import org.example.model.Category;

import java.util.List;

public interface CategoryService {
    String save(Category category);

    List<Category> getAllProductGroupByCategoryName(String name);
}
