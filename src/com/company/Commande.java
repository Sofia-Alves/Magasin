package com.company;

import java.util.ArrayList;

public class Commande {
    private int Identifiant;
    private double Prix;
    private ArrayList<Produits> ListeDesCommandes;

    public Commande(int identifiant, double prix, ArrayList<Produits> listeDesCommandes) {
        Identifiant = identifiant;
        Prix = prix;
        ListeDesCommandes = listeDesCommandes;
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

    public ArrayList<Produits> getListeDesCommandes() {
        return ListeDesCommandes;
    }

    public void setListeDesCommandes(ArrayList<Produits> listeDesCommandes) {
        ListeDesCommandes = listeDesCommandes;
    }
}
