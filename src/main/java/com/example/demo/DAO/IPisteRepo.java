package com.example.demo.DAO;

import com.example.demo.entities.Piste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPisteRepo extends JpaRepository<Piste,Long > {
    Piste findByNumPiste(Long numPiste);

}
