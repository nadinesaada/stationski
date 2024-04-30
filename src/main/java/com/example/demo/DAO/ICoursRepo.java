package com.example.demo.DAO;

import com.example.demo.entities.Cours;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ICoursRepo extends JpaRepository<Cours ,Long> {
    Cours findByNumCours(Long numCours);
}
