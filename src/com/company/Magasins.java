package com.company;

import java.util.ArrayList;


public class Magasins {


    private String Nom;
    private ArrayList<Produits> ListeProduitsDuMagasin = null;

    public Magasins(String nom, ArrayList<Produits> listeProduitsDuMagasin) {
        Nom = nom;
        ListeProduitsDuMagasin = listeProduitsDuMagasin;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public ArrayList<Produits> getListeProduitsDuMagasin() {
        return ListeProduitsDuMagasin;
    }

    public void setListeProduitsDuMagasin(ArrayList<Produits> listeProduitsDuMagasin) {
        ListeProduitsDuMagasin = listeProduitsDuMagasin;
    }
}












