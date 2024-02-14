package uz.urinov.embarkxjobproject.company;

import java.util.List;

public interface CompanyService {

    boolean saveCompany(Company newCompany);

    List<Company> getAllCompanies();

    Company getCompanyById(Long id);

    boolean deleteCompanyById(Long id);

    boolean updateCompanyById(Long id, Company newCompany);
}
