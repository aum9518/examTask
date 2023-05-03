package org.example.service.serviceImpl;

import org.example.model.Company;
import org.example.repository.repositoryImpl.CompanyRepositoryImpl;
import org.example.service.CompanyService;

public class CompanyServiceImpl implements CompanyService {
    CompanyRepositoryImpl company1 = new CompanyRepositoryImpl();

    @Override
    public String saveCompany(Company company) {
        return company1.saveCompany(company);
    }

    @Override
    public String deleteById(Long id) {
        return company1.deleteById(id);
    }

    @Override
    public Company update(Long id, Company company) {
        return company1.update(id, company);
    }
}
