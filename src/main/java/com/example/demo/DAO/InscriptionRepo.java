package com.example.demo.DAO;

import com.example.demo.entities.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepo extends JpaRepository<Inscription, Long> {
    Inscription findByNumInscription(Long numInscription);
}
