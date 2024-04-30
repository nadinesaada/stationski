package com.example.demo.controllers;

import com.example.demo.entities.Abonnement;
import com.example.demo.entities.TypeAbonnement;
import com.example.demo.services.IAbonnementService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class AbonnementController {
    IAbonnementService iAbonnementService;
    @GetMapping("/retrieve-all-abonnementBytype/{typeAbonnement}")
    public Set<Abonnement> getAbonnementsBytype(@PathVariable("typeAbonnement") TypeAbonnement typeAbonnement) {
        Set<Abonnement> listAbonnement = iAbonnementService.getAbonnementByType(typeAbonnement);
        return listAbonnement;
    }
    @GetMapping("/getAbonnementsByDates/{date1}/{date2}")
    public List<Abonnement> getAbonnementsByDates(@PathVariable("date1") @DateTimeFormat(pattern= "yyyy-MM-dd") LocalDate startDate,
                                                  @PathVariable("date2") @DateTimeFormat(pattern= "yyyy-MM-dd")  LocalDate endDate){
        return iAbonnementService.retrieveAbonnementByDates(startDate, endDate);
    }
}
