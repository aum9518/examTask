package org.example.repository;

import org.example.model.Company;

public interface CompanyRepository {
    String saveCompany(Company company);

    String deleteById(Long id);

    Company update(Long id, Company company);
}
