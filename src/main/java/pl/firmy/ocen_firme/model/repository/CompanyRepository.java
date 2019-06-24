package pl.firmy.ocen_firme.model.repository;


import org.springframework.data.repository.CrudRepository;
import pl.firmy.ocen_firme.model.Company;

public interface CompanyRepository extends CrudRepository<Company,Integer>
{
}
