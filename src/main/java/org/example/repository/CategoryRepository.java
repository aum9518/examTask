package org.example.repository;

import org.example.model.Category;

import java.util.List;

public interface CategoryRepository {
    String save(Category category);

    List<Category> getAllProductGroupByCategoryName(String name);

}
