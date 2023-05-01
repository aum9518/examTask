package org.example.service.serviceImpl;

import org.example.model.Category;
import org.example.repository.repositoryImpl.CategoryRepositoryImpl;
import org.example.service.CategoryService;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    CategoryRepositoryImpl categ = new CategoryRepositoryImpl();
    @Override
    public String save(Category category) {
        return categ.save(category);
    }

    @Override
    public List<Category> getAllProductGroupByCategoryName(String name) {
        return categ.getAllProductGroupByCategoryName(name);
    }
}
