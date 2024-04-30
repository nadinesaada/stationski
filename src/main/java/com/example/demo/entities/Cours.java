package com.example.demo.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cours implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long numCours;

    @Column(name = "niveau")
    private int niveau;

    @Column(name = "prix")
    private Float prix;

    @Column(name = "creneau")
    private int creneau;

    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;

    @Enumerated(EnumType.STRING)
    private Support support;

    @OneToMany(mappedBy = "cour")
    private List<Inscription> inscriptions;
}
