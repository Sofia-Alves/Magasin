package com.company;

import java.util.ArrayList;

public class Produits {
    private String Nom;
    private Double Prix;
    private int Reference;
    private int Quantite;

    public Produits(String nom, Double prix, int reference, int quantite) {
        Nom = nom;
        Prix = prix;
        Reference = reference;
        Quantite = quantite;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
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

    public int getQuantite() {
        return Quantite;
    }

    public void setQuantite(int quantite) {
        Quantite = quantite;
    }
}


