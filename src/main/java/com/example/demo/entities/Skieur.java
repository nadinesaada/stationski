package com.example.demo.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Skieur  implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long numSkieur;

    @Column(name = "nomS")
    private String nomS;

    @Column(name = "prenomS")
    private String prenomS;

    private LocalDate dateNaissance;

    @Column(name = "Ville")
    private String ville;

    @ManyToMany
    private List<Piste> pistes;

    @OneToMany(mappedBy = "skieur")
    private List<Inscription> inscriptions;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Abonnement abonnement;

}
