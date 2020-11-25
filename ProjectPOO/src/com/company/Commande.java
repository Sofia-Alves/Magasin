package com.company;

import java.util.ArrayList;

public class Commande {
    private int Identifiant;
    private double Prix;
    private ArrayList<Produits> ListeDeProduitUtilisateur;

    public Commande(int identifiant, double prix, ArrayList<Produits> listeDeProduitUtilisateur) {
        Identifiant = identifiant;
        Prix = prix;
        ListeDeProduitUtilisateur = listeDeProduitUtilisateur;
    }

    public int getIdentifiant() {
        return Identifiant;
    }

    public void setIdentifiant(int identifiant) {
        Identifiant = identifiant;
    }

    public double getPrix() {
        return Prix;
    }

    public void setPrix(double prix) {
        Prix = prix;
    }

    public ArrayList<Produits> getListeDeProduitUtilisateur() {
        return ListeDeProduitUtilisateur;
    }

    public void setListeDeProduitUtilisateur(ArrayList<Produits> listeDeProduitUtilisateur) {
        ListeDeProduitUtilisateur = listeDeProduitUtilisateur;
    }
}
