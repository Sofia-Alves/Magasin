package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Magasins {
    static Scanner scanner = new Scanner(System.in);
    private String Nom;
    private ArrayList<Produits> ListeProduitsDuMagasin = null;

    // l'admin recupère la liste listeproduitdumagasin et a partir de cette liste il rentre un nouveau produit s'il existe deja on augmente son stock
    // et s'il existe pas on rajoute
    public Magasins() {

    }

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


