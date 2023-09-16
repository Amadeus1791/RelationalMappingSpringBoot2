package com.example.jparelations.model;

import jakarta.persistence.*;
import lombok.*;


@Data
@NoArgsConstructor
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    //@OneToOne
    // private Address address;



    public Person(String name, Address address) {
        this.name = name;
        //this.address = address;
    }

    public Person(String name) {
        this.name = name;
    }
}
