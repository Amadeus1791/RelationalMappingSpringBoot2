package com.example.jparelations.service;

import com.example.jparelations.model.Capital;
import com.example.jparelations.model.Country;
import com.example.jparelations.repo.CapitalRepo;
import com.example.jparelations.repo.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    @Autowired
    private CountryRepo countryRepo;
    @Autowired
    private CapitalRepo capitalRepo;


    public Country addCountry(Country country) {
        return countryRepo.save(country);
    }


    public List<Country> getCountries() {
        return countryRepo.findAll();
    }

    // 2/addcaptial/4
    public Country addCaptialToCountry(Long countryId, Long capitalId) {
        Optional<Country> countryOptional = countryRepo.findById(countryId);
        Optional<Capital> capitalOptional = capitalRepo.findById(capitalId);

        if (countryOptional.isEmpty() || capitalOptional.isEmpty()) {
            throw new RuntimeException("object(s) not valid");
        }
        Country country = countryOptional.get();
        Capital capital = capitalOptional.get();

        country.setCapital(capital);
        capital.setCountry(country);

        countryRepo.save(country);
        capitalRepo.save(capital);

        return country;
    }

}
