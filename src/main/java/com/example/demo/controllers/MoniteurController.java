package com.example.demo.controllers;

import com.example.demo.entities.Moniteur;
import com.example.demo.services.IMoniteurService;
import org.hibernate.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class MoniteurController {
    IMoniteurService iMoniteurService;
    @GetMapping("/retrieve-all-moniteurs")
    public List<Moniteur> getAbonnements() {
        List<Moniteur> listMoniteurs = iMoniteurService.retrieveAllMoniteurs();
        return listMoniteurs;
    }

    @PostMapping("/add-moniteur")
    public Moniteur addMoniteur(@RequestBody Moniteur m) {
        Moniteur moniteur = iMoniteurService.addMoniteur(m);
        return moniteur;
    }

    @PutMapping("/update-moniteur")
    public Moniteur updateMoniteur(@RequestBody Moniteur m) {
        Moniteur moniteur= iMoniteurService.updateMoniteur(m);
        return moniteur;
    }

    @PostMapping("/addMoniteurAndAssignToCourse")
    public Moniteur addMoniteurAndAssignToCourse(@RequestBody Moniteur m) {
        Moniteur moniteur = iMoniteurService.addMoniteurAndAssignToCours(m);
        return moniteur;
    }

}
