package com.example.demo.DAO;

import com.example.demo.entities.Moniteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IMoniteurRepo extends JpaRepository<Moniteur,Long> {
    

}
