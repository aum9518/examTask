package org.example.service;

import org.example.model.Company;

public interface CompanyService {
    String saveCompany(Company company);

    String deleteById(Long id);

    Company update(Long id, Company company);
}
