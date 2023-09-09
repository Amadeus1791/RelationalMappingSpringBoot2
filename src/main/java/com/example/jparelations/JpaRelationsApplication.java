package com.example.jparelations;

import com.example.jparelations.model.Address;
import com.example.jparelations.model.Person;
import com.example.jparelations.service.AddressService;
import com.example.jparelations.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaRelationsApplication implements CommandLineRunner {
    @Autowired
    AddressService addressService;
    @Autowired
    PersonService personService;

    public static void main(String[] args) {
        SpringApplication.run(JpaRelationsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       // addressService.deleteAllAddresses();

        Person person1 = new Person("person1");
        Person person2 = new Person("person2");
        Address address = new Address( "myfirstaddress", 1234, person1);
        Address address2 = new Address( "mysecondaddress", 5678, person1);
        Address address3 = new Address( "mysecondaddress", 5678, person2);

        addressService.addAddress(address);
      //  addressService.deleteAddress(address.getId());
        addressService.addAddress(address2);
        addressService.addAddress(address3);

//        Person person1 = new Person("person1");
//        personService.addPerson(person1);
//        Person person2 = new Person("person2", address);
//        personService.addPerson(person2);
    }
}
