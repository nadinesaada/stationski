package com.example.demo.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Moniteur  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numMoniteur;

    @Column(name = "nomM")
    private String nomM;

    @Column(name = "prenomM")
    private String prenomM;

    private LocalDate dateRecru;

    @OneToMany
    private List<Cours> cours;
}
