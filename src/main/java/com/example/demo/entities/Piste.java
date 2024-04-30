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
public class Piste  implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long numPoste;

    @Column(name = "nomPiste")
    private String nomPiste;

    @Enumerated(EnumType.STRING)
    private Couleur couleur;

    @Column(name = "longeur")
    private int longeur;

    @Column(name = "pente")
    private int pente;

    @ManyToMany(mappedBy = "pistes")
    private List<Skieur> skieurs;

}
