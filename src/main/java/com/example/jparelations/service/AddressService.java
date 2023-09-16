package com.example.jparelations.service;

import com.example.jparelations.model.Address;
import com.example.jparelations.repo.AddressRepo;
import com.example.jparelations.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private AddressRepo addressRepo;

    @Autowired
    private PersonRepo personRepo;

    public Address addAddress(Address address) {
       // personRepo.save(address.getPerson());
       return addressRepo.save(address);
    }

    public Address deleteAddress(Long id) {
        Optional<Address> foundObj = addressRepo.findById(id);
        if (foundObj.isPresent()) {
            Address address = foundObj.get();
            addressRepo.delete(address);
            return address;
        }
        throw new IllegalArgumentException("No entry found with this " + id);
    }

    public void deleteAllAddresses() {
        addressRepo.deleteAll();
    }

}
