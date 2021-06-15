package com.example.demo.Domain;

public class Persona {
    private String nom;
    private String municipi;
    
    public Persona() {}

    public Persona(String nom, String municipi) {
        this.nom = nom;
        this.municipi = municipi;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMunicipi() {
        return municipi;
    }

    public void setMunicipi(String municipi) {
        this.municipi = municipi;
    }
}