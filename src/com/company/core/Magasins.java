package com.company.core;
import java.util.ArrayList;
import java.util.Scanner;

public class Magasins {
    static Scanner scanner = new Scanner(System.in);
    private String nom;
    private static ArrayList<Produits> listeProduitsDuMagasin;

    // l'admin recupère la liste listeproduitdumagasin et a partir de cette liste il rentre un nouveau produit s'il existe deja on augmente son stock
    // et s'il existe pas on rajoute

    public Magasins(String nomDuMagasin) {
        nom = nomDuMagasin;
    }

    public void ajoutProduits(ArrayList<Produits> listProduits) {
        listeProduitsDuMagasin = listProduits;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public static ArrayList<Produits> getListeProduitsDuMagasin() {
        return listeProduitsDuMagasin;
    }

    public static void setListeProduitsDuMagasin(ArrayList<Produits> listeProduitsDuMagasin) {
        Magasins.listeProduitsDuMagasin = listeProduitsDuMagasin;
    }

    public static void imprimerLaListe() {
        if (listeProduitsDuMagasin.isEmpty()) {
            System.err.println("La liste est vide !");
        } else {
            for(Produits produits : listeProduitsDuMagasin) {
                System.out.println("Nom : " + produits.getNom() + " quantite : " + produits.getQuantitee()
                        + " prix : " + produits.getPrix() + " reference : " + produits.getReference());
            }
        }
    }
}


