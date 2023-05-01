package org.example.repository.repositoryImpl;

import jakarta.persistence.EntityManager;
import org.example.config.Config;
import org.example.model.Category;
import org.example.repository.CategoryRepository;

import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository {
    EntityManager e = Config.getEntityManager();
    @Override
    public String save(Category category) {
        e.getTransaction().begin();
        e.persist(category);
        e.getTransaction().commit();
        e.close();
        return "Successfully saved...";
    }

    @Override
    public List<Category> getAllProductGroupByCategoryName(String name) {

        return null;
    }
}
