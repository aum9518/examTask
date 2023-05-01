package org.example.service.serviceImpl;

import org.example.model.Product;
import org.example.repository.repositoryImpl.ProductRepositoryImpl;
import org.example.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductRepositoryImpl product1 = new ProductRepositoryImpl();
    @Override
    public String save(Product product) {
        return product1.save(product);
    }

    @Override
    public List<Product> findAllProductsByCompanyId(Long companyId) {
        return product1.findAllProductsByCompanyId(companyId);
    }

    @Override
    public String delete(Long id) {
        return product1.delete(id);
    }
}
