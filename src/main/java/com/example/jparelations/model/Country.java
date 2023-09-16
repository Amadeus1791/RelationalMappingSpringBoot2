package com.example.jparelations.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Integer population;

    private String shortcut;

    @OneToOne
    //@Column(nullable = false)
    private Capital capital;

    public Country(String name, Integer population, String shortcut) {
        this.name = name;
        this.population = population;
        this.shortcut = shortcut;
    }


}
