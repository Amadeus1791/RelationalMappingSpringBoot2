package com.example.jparelations.controller;

import com.example.jparelations.model.Country;
import com.example.jparelations.repo.CountryRepo;
import com.example.jparelations.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/country")
@RestController
public class CountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping("/getall")
    public List<Country> getAllCountries() {
        return countryService.getCountries();
    }

    @PostMapping("/add")
    public Country addCountry(@RequestBody Country country) {
        return countryService.addCountry(country);
    }

    @PatchMapping ("/{countryId}/addcapital/{capitalId}")
    public Country addCapitalToCountry(@PathVariable Long countryId, @PathVariable Long capitalId) {
        return countryService.addCaptialToCountry(countryId, capitalId);
    }
}
