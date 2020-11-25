package com.company;

import java.util.ArrayList;

public class Client extends Utilisateurs{
    private String Nom;
    private String Prenom;
    private ArrayList<Produits> ListeDeCommandeDesClients;

    public Client(int identifiant, int motDePasse, String addresseMail, String nom, String prenom, ArrayList<Produits> listeDeCommandeDesClients) {
        super(identifiant, motDePasse, addresseMail);
        Nom = nom;
        Prenom = prenom;
        ListeDeCommandeDesClients = listeDeCommandeDesClients;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public ArrayList<Produits> getListeDeCommandeDesClients() {
        return ListeDeCommandeDesClients;
    }

    public void setListeDeCommandeDesClients(ArrayList<Produits> listeDeCommandeDesClients) {
        ListeDeCommandeDesClients = listeDeCommandeDesClients;
    }

}



//****** affichage des produits*********

// le client doit avoir l'accès à la liste des produits

