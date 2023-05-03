package org.example.repository.repositoryImpl;

import jakarta.persistence.EntityManager;
import org.example.config.Config;
import org.example.model.Product;
import org.example.repository.ProductRepository;

import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    EntityManager e = Config.getEntityManager();

    @Override
    public String save(Product product) {
        e.getTransaction().begin();
        e.persist(product);
        e.getTransaction().commit();
        e.close();
        return "Successfully saved";
    }

    @Override
    public List<Product> findAllProductsByCompanyId(Long companyId) {
        e.getTransaction().begin();
        List<Product> list = e.createQuery("select p from Product p join p.company c where c.id = :id", Product.class)
                .setParameter("id", companyId)
                .getResultList();
        e.getTransaction().commit();
        e.close();
        return list;
    }

    @Override
    public String delete(Long id) {
        e.getTransaction().begin();
        Product product = e.find(Product.class, id);
        e.remove(product);
        e.getTransaction().commit();
        e.close();
        return "Successfully deleted...";
    }
}
