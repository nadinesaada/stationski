package com.example.demo.services;

import com.example.demo.entities.Skieur;
import com.example.demo.entities.TypeAbonnement;

import java.util.List;

public interface ISkieurService {
    Skieur addSkieur(Skieur skieur);

    List<Skieur> getAllSkieur();

    Skieur getSkieurbyId(long id);

    public Skieur getSkieurByNomSAndPrenomS(String nom,String prenom);

   public void deletebyId(long id);

    Skieur updateSkieur(long id);
    Skieur assignSkieurToPiste(Long numSkieur, Long numPiste);

    Skieur addSkieurAndAssignToCours(Skieur skieur, Long numCours);
    List<Skieur> retrieveSkieursByTypeAbonnement(TypeAbonnement typeAbonnement);
}
