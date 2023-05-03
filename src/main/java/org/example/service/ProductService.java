package org.example.service;

import org.example.model.Product;

import java.util.List;

public interface ProductService {
    String save(Product product);

    List<Product> findAllProductsByCompanyId(Long companyId);

    String delete(Long id);
}
