package com.example.demo.controllers;

import com.example.demo.entities.Inscription;
import com.example.demo.services.IInscriptionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class InscriptionController {
    IInscriptionService inscriptionService;
    public Inscription addSkieurAndAssignToCourse(@RequestBody Inscription inscription,
                                                  @PathVariable("numSkieur")Long numSkieur,
                                                  @PathVariable("numCours")Long numCours) {
        Inscription ins = inscriptionService.addInscriptionAndAssignToSkieurAndCourse(inscription,numSkieur,numCours);
        return ins;
    }
    @PutMapping("/assignInscriptionToCours/{numInscription}/{numCours}")
    public Inscription assignInscriptionToCours(@PathVariable("numInscription") Long numInscription,@PathVariable("numCours") Long numCours)
    {
        return  inscriptionService.assignInscriptionToCours(numInscription,numCours);
    }

}
