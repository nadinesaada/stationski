package com.example.demo.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Inscription  implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long numInscription;

    @Column(name = "numSemaine")
    private int numSemaine;

    @ManyToOne
    private Skieur skieur;

    @ManyToOne
    @JsonIgnore
    private Cours cour;

}
