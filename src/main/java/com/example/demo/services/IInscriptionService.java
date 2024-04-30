package com.example.demo.services;

import com.example.demo.entities.Inscription;

public interface IInscriptionService {
    Inscription assignInscriptionToCours(Long numInscription, Long numCours);
    Inscription addInscriptionAndAssignToSkieurAndCourse(Inscription inscription, Long numSkieur, Long numCours);

}
