package com.example.demo.DAO;

import com.example.demo.entities.Abonnement;
import com.example.demo.entities.Skieur;
import com.example.demo.entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

public interface IAbonnementRepo extends JpaRepository<Abonnement, Long> {
    @Query(value = "Select a from Abonnement a where a.typeAbon = :typeAbon order by a.dateDebut")

    public Abonnement getAbonnementByTypeAbon(@Param("typeAbon") TypeAbonnement typeAbon);

    @Query(value = "Select a from Abonnement a where a.dateDebut = :dateDebut and a.dateFin= :dateFin")

    public Abonnement getAbonnementByDateDebutAndDateFin(@Param("dateDebut") Date dateDebut,@Param("dateFin") Date dateFin);

    Set<Abonnement> findByAbonnementTypeAbonnement(TypeAbonnement typeAbonnement);

    List<Abonnement> getAbonnementsByDateDebutBetween(LocalDate date1, LocalDate date2);
}
