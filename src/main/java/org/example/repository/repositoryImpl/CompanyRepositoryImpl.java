package org.example.repository.repositoryImpl;

import jakarta.persistence.EntityManager;
import org.example.config.Config;
import org.example.model.Company;
import org.example.repository.CompanyRepository;

public class CompanyRepositoryImpl implements CompanyRepository {
    EntityManager e = Config.getEntityManager();
    @Override
    public String saveCompany(Company company) {
        e.getTransaction().begin();
        e.persist(company);
        e.getTransaction().commit();
        e.close();
        return "Successfully saved...";
    }

    @Override
    public String deleteById(Long id) {
        e.getTransaction().begin();
        Company company = e.find(Company.class, id);
        e.remove(company);
        e.getTransaction().commit();
        e.close();

        return "Successfully deleted";
    }

    @Override
    public Company update(Long id, Company company) {
        e.getTransaction().begin();
        Company company1 = e.find(Company.class, id);
        company1.setName(company.getName());
        company1.setCountry(company.getCountry());
        e.getTransaction().commit();
        e.close();
        return company1;
    }
}
