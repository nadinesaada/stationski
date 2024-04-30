package com.example.demo.controllers;

import com.example.demo.entities.Skieur;
import com.example.demo.services.ISkieurService;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/Skieur")
public class SkieurController {


    private ISkieurService skieurService;
    @PostMapping("/addSkieur")
    public Skieur addSkieur(@RequestBody Skieur sk){
        return skieurService.addSkieur(sk);
    }
    @PostMapping("/get/{id}")
    public Skieur getSkiuerbyId(@PathVariable("id")long id){
        return skieurService.getSkieurbyId(id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") long id){
        this.skieurService.deletebyId(id);
    }
    @GetMapping("/get/{nom}/{prenom}")
    public Skieur getbyNomAndPrenom(@PathVariable("nom")String nom,@PathVariable("prenom")String prenom){
        return skieurService.getSkieurByNomSAndPrenomS(nom, prenom);
    }

}
