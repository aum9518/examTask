package org.example.repository;

import org.example.model.Product;

import java.util.List;

public interface ProductRepository {
    String save(Product product);

    List<Product> findAllProductsByCompanyId(Long companyId);

    String delete(Long id);
}
