package pl.firmy.ocen_firme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.firmy.ocen_firme.model.Company;
import pl.firmy.ocen_firme.model.repository.CompanyRepository;

@Controller
public class MainController
{

    CompanyRepository companyRepository;
//wstrzykiwanie beana przez konstruktor
    public MainController(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

//jak chce przyjmowac cos z formularza to muszę wpisać typ przyjmowanego obiektu ktory bedzie przekazany przez templatke
    @GetMapping("/")
    public String formForCompany(@ModelAttribute Company company)
    {
        return "add";
    }

    @PostMapping("/")
    public String createGrade(@ModelAttribute Company company, Model model)
    {
        companyRepository.save(company);
        model.addAttribute("numberOfAll",companyRepository.count());
        return "thank_you_note";
    }

}
