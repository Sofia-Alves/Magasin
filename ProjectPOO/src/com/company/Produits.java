package com.company;

import java.util.ArrayList;

public class Produits {
    private String Nom;
  private   int Quantite;
 private    Double Prix;
private     int Reference;


    public Produits(String nom, int quantite, Double prix, int reference) {
        Nom = nom;
        Quantite = quantite;
        Prix = prix;
        Reference = reference;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public int getQuantite() {
        return Quantite;
    }

    public void setQuantite(int quantite) {
        Quantite = quantite;
    }

    public Double getPrix() {
        return Prix;
    }

    public void setPrix(Double prix) {
        Prix = prix;
    }

    public int getReference() {
        return Reference;
    }
    public void setReference(int reference) {
        Reference = reference;
    }

}


