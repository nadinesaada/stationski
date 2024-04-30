package com.example.demo.DAO;

import com.example.demo.entities.Skieur;

import com.example.demo.entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

public interface ISkieurRepo extends JpaRepository<Skieur,Long> {

    public Skieur findByNomSAndPrenomS(String nom,String prenom);

    public List<Skieur> findByDateNaissanceGreaterThan(Date datenaissance);
    public Skieur findByNomSAndPrenomSAndDateNaissance(String nom,String prenom,Date datenaissance);

    @Query(value = "Select s from Skieur s where s.nomS = :nomS and s.prenomS= :prenomS")

    public Skieur getSkieurByNomSAndPrenomS(@Param("nomS") String nomS,@Param("prenomS") String prenomS);

    public Skieur addSkieur(Skieur skieur);
     public List<Skieur> getAllSkieur();
     public Skieur getSkieurbyId(long id);
     public void deletebyId(long id);
     public Skieur updateSkieur(long id);
    Skieur findByNumSkieur(Long numSkieur);
    List<Skieur> findByAbonnementTypeAbonnement(TypeAbonnement TypeAbonnement);


}
