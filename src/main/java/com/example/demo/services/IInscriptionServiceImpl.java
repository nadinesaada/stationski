package com.example.demo.services;

import com.example.demo.DAO.ICoursRepo;
import com.example.demo.DAO.ISkieurRepo;
import com.example.demo.DAO.InscriptionRepo;
import com.example.demo.configs.UtilityFonction;
import com.example.demo.entities.Cours;
import com.example.demo.entities.Inscription;
import com.example.demo.entities.Skieur;
import com.example.demo.entities.TypeCours;
import org.aspectj.bridge.MessageUtil;

import javax.transaction.Transactional;

public class IInscriptionServiceImpl implements IInscriptionService{
    InscriptionRepo inscriptionRepo;
    ICoursRepo coursRepo;
    ISkieurRepo iSkieurRepo;
    private MessageUtil log;

    @Override
    public Inscription assignInscriptionToCours(Long numInscription, Long numCours) {
        Inscription inscription=inscriptionRepo.findByNumInscription(numInscription);
        Cours cours=coursRepo.findByNumCours(numCours);
        inscription.setCour(cours);
        inscriptionRepo.save(inscription);
        return inscription;
    }
    @Transactional
    @Override
    public Inscription addInscriptionAndAssignToSkieurAndCourse(Inscription inscription, Long numSkieur, Long numCours) {
        Cours cours = coursRepo.findByNumCours(numCours);
        Skieur skieur = iSkieurRepo.findByNumSkieur(numSkieur);
        int ageSkieur = UtilityFonction.calculateAge(skieur.getDateNaissance());
        log.info("age skieur : "+ageSkieur);
        if(cours.getTypeCours().equals(TypeCours.COLLECTIF_ADULTE) & ageSkieur>18) {
            if (cours.getInscriptions().size() < 6) {
                Inscription inscri = inscriptionRepo.save(inscription);
                inscri.setSkieur(skieur);
                log.info("le nombre des inscriptions en cours est " + cours.getInscriptions().size());
                inscri.setCour(cours);
            }
        }
        else if (cours.getTypeCours().equals(TypeCours.COLLECTIF_ENFANT) & ageSkieur<18) {
            if (cours.getInscriptions().size() < 6) {
                Inscription insci = inscriptionRepo.save(inscription);
                insci.setSkieur(skieur);
                log.info("le nombre des inscriptions en cours est " + cours.getInscriptions().size());
                insci.setCour(cours);
            }
        }
        else {
            log.info("le nombre d'inscription max a ce cours est atteint ou age incompatible" + " avec le cours");
        }
        return inscription;
    }
}
