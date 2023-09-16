package com.example.jparelations.service;

import com.example.jparelations.model.Capital;
import com.example.jparelations.repo.CapitalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapitalService  {
    @Autowired
    private CapitalRepo capitalRepo;

    public Capital addCapital(Capital capital) {
//        if (capital.getCountry() == null) {
//            throw new RuntimeException("country cannot be null");
//        }
        return capitalRepo.save(capital);
    }

    public List<Capital> getAllCapitals() {
        return capitalRepo.findAll();
    }


}
