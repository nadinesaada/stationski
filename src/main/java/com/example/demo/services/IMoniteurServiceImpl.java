package com.example.demo.services;

import com.example.demo.DAO.IMoniteurRepo;
import com.example.demo.entities.Moniteur;

import java.util.List;

public class IMoniteurServiceImpl implements IMoniteurService{
    IMoniteurRepo imoniteurRepo;
    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return imoniteurRepo.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur m) {
        return imoniteurRepo.save(m);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur m) {
        return imoniteurRepo.save(m);
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return imoniteurRepo.findById(numMoniteur).get();
    }

    @Override
    public Moniteur addMoniteurAndAssignToCours(Moniteur moniteur) {
        Moniteur moniteurs = Moniteur.builder().build();
        Moniteur moniteur1 = imoniteurRepo.save(moniteur);
        return moniteur1;
    }
}
