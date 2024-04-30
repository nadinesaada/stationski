package com.example.demo.services;

import com.example.demo.entities.Moniteur;

import java.util.List;

public interface IMoniteurService {

    List<Moniteur> retrieveAllMoniteurs();

    Moniteur addMoniteur(Moniteur m);

    Moniteur updateMoniteur (Moniteur m);

    Moniteur retrieveMoniteur (Long numMoniteur);
    Moniteur addMoniteurAndAssignToCours(Moniteur moniteur);
}
