package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Magasins {
static Scanner scanner = new Scanner(System.in);

    private String Nom;
    private ArrayList<Produits> ListeProduitsDuMagasin = null;
    private ArrayList<Produits> ListeDeClient = null;
    private ArrayList<Produits> ListeAdministrateur = null;

    public Magasins(String nom) {
        Nom = nom;
    }

    public Magasins() {
        ListeProduitsDuMagasin = new ArrayList<>();
    }
    public Magasins() {
        ListeDeClient = new ArrayList<>();
    }
    public Magasins() {
        ListeAdministrateur = new ArrayList<>();
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

    public ArrayList<Produits> getListeDeClient() {
        return ListeDeClient;
    }

    public void setListeDeClient(ArrayList<Produits> listeDeClient) {
        ListeDeClient = listeDeClient;
    }

    public ArrayList<Produits> getListeAdministrateur() {
        return ListeAdministrateur;
    }

    public void setListeAdministrateur(ArrayList<Produits> listeAdministrateur) {
        ListeAdministrateur = listeAdministrateur;

    }


}












