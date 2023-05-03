package org.example;

import org.example.config.Config;
import org.example.model.Category;
import org.example.model.Company;
import org.example.model.Product;
import org.example.service.serviceImpl.CategoryServiceImpl;
import org.example.service.serviceImpl.CompanyServiceImpl;
import org.example.service.serviceImpl.ProductServiceImpl;

import java.time.LocalDate;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        Config.getEntityManager();
        CompanyServiceImpl company = new CompanyServiceImpl();
        ProductServiceImpl product = new ProductServiceImpl();
        CategoryServiceImpl category = new CategoryServiceImpl();

//        System.out.println(company.saveCompany(new Company("Jashtyk", "KG")));
//        System.out.println(company.update(1L, new Company("Asman", "KGS")));
//        System.out.println(company.deleteById(1L));

        Company company1 = new Company("Jetigen", "KG");
        Category category1 = new Category("electronic");
//        System.out.println(product.save(new Product("Radio", 500, LocalDate.of(2022, 1, 1),company1,category1)));
//        System.out.println(product.findAllProductsByCompanyId(3L));
//        System.out.println(product.delete(1L));

        System.out.println(category.save(new Category("vegetables")));
    }

}
