package com.example.jparelations.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Capital {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Column(nullable = false)
    private Integer zipcode;

    private Integer cityPopulation;

    @JsonIgnore
    @OneToOne(mappedBy = "capital")
    private Country country;


    public Capital(String name, Integer zipcode, Integer cityPopulation) {
        this.name = name;
        this.zipcode = zipcode;
        this.cityPopulation = cityPopulation;
    }
}
