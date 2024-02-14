package uz.urinov.embarkxjobproject.company;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;


    @Override
    public boolean saveCompany(Company newCompany) {
        companyRepository.save(newCompany);
        return true;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteCompanyById(Long id) {
        companyRepository.deleteById(id);
        return true;
    }

    @Override
    public boolean updateCompanyById(Long id, Company newCompany) {

        Optional<Company> byId = companyRepository.findById(id);

        if (byId.isPresent()){
            Company company = byId.get();
            company.setName(newCompany.getName());
            company.setDescription(newCompany.getDescription());
            companyRepository.save(company);
            return true;
        }
        return false;
    }
}
