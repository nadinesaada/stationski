package com.example.demo.services;

import com.example.demo.DAO.ICoursRepo;
import com.example.demo.entities.Cours;

import java.util.List;

public class ICoursServiceImpl implements ICoursService{

    ICoursRepo coursRepo;
    @Override
    public List<Cours> retrieveAllCourses() {
        return coursRepo.findAll();
    }

    @Override
    public Cours addCours(Cours cours) {
        return coursRepo.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepo.save(cours);
    }

    @Override
    public Cours retrieveCours(Long cours) {
        return coursRepo.findById(cours).get();
    }
}
