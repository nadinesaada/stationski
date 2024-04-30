package com.example.demo.services;

import com.example.demo.DAO.ICoursRepo;
import com.example.demo.DAO.IPisteRepo;
import com.example.demo.DAO.ISkieurRepo;
import com.example.demo.entities.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class ISkieurServiceImpl implements ISkieurService{

    private ISkieurRepo iSkieurRepo;
    private IPisteRepo iPisteRepo;
    private ICoursRepo icoursRepo;

    @Override
    public Skieur addSkieur(Skieur skieur){
        return  iSkieurRepo.save(skieur);
    }

    @Override
     public List<Skieur> getAllSkieur(){ return iSkieurRepo.findAll();
     }
     @Override
     public Skieur getSkieurbyId(long id){
        return iSkieurRepo.findById(id).get();
     }

    @Override
    public Skieur getSkieurByNomSAndPrenomS(String nom, String prenom) {
        return iSkieurRepo.findByNomSAndPrenomS(nom,prenom);
    }

    @Override
    public void deletebyId(long id) {
        iSkieurRepo.delete(getSkieurbyId(id));
    }


     @Override
     public Skieur updateSkieur(long id){
        Skieur sk=iSkieurRepo.findById(id).get();
        return iSkieurRepo.save(sk);
     }

    @Override
    public Skieur assignSkieurToPiste(Long numSkieur, Long numPiste) {
        Skieur skieur = iSkieurRepo.findByNumSkieur(numSkieur);
        Piste piste =iPisteRepo.findByNumPiste(numPiste);
        skieur.getPistes().add(piste);
        return skieur;
    }

    @Override
    public Skieur addSkieurAndAssignToCours(Skieur skieur, Long numCours) {
            Cours cours = icoursRepo.findByNumCours(numCours);
            Skieur s = iSkieurRepo.save(skieur);
            Set<Inscription> inscriptions = new HashSet<>();
            inscriptions = (Set<Inscription>) s.getInscriptions();
            inscriptions.stream().forEach(
                    inscription ->  {
                        inscription.setCour(cours);
                    }

            );
            //  t2= date sys - t1
            return null;

    }

    @Override
    public List<Skieur> retrieveSkieursByTypeAbonnement(TypeAbonnement typeAbonnement) {
        return iSkieurRepo.findByAbonnementTypeAbonnement(typeAbonnement);
    }


    // public Skieur findSkieurbyname(String nom){

    //    return iSkieurRepo.findSkieur(nom);

   // }

}
