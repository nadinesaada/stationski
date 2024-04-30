package com.example.demo.services;

import com.example.demo.entities.Abonnement;
import com.example.demo.entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface IAbonnementService {
    Set<Abonnement> getAbonnementByType(TypeAbonnement type);

    List<Abonnement> retrieveAbonnementByDates(LocalDate startDate, LocalDate endDate);
    public void retrieveAbonnements();
}
