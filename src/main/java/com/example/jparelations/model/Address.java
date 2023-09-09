package com.example.jparelations.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Integer zipcode;

    //@OneToOne
    @ManyToOne
    private Person person;

    public Address(String name, Integer zipcode, Person person) {
        this.name = name;
        this.zipcode = zipcode;
        this.person = person;
    }


}
