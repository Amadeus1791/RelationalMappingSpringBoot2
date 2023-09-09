package com.example.jparelations.service;

import com.example.jparelations.model.Address;
import com.example.jparelations.model.Person;
import com.example.jparelations.repo.AddressRepo;
import com.example.jparelations.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonRepo personRepo;
    @Autowired
    AddressRepo addressRepo;

    public Person addPerson(Person person) {
//        Address address = person.getAddress();
//        if (address != null) {
//            addressRepo.save(address);
//        }
        return personRepo.save(person);
    }


    public void deleteAllPersons() {
        personRepo.deleteAll();
    }
}
