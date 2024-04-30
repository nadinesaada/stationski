package com.example.demo.services;

import com.example.demo.DAO.IAbonnementRepo;
import com.example.demo.entities.Abonnement;
import com.example.demo.entities.TypeAbonnement;
import org.springframework.scheduling.annotation.Scheduled;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class IAbonnementServiceImpl implements IAbonnementService{
    IAbonnementRepo iAbonnementRepo;
    @Override
    public Set<Abonnement> getAbonnementByType(TypeAbonnement type) {
        return iAbonnementRepo.findByAbonnementTypeAbonnement(type);
    }

    @Override
    public List<Abonnement> retrieveAbonnementByDates(LocalDate startDate, LocalDate endDate) {
        return iAbonnementRepo.getAbonnementsByDateDebutBetween(startDate, endDate);
    }

    @Override
    public void retrieveAbonnements() {

    }

}
