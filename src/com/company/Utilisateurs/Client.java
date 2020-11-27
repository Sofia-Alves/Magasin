package com.company.utilisateurs;

import com.company.core.Commande;
import com.company.core.Magasins;

import java.util.ArrayList;

public class Client extends Utilisateurs {
    private String nom;
    private String prenom;
    private ArrayList<Commande> listeCommandeClient;

    public Client(int identifiant, int motDePasse, String addresseMail, String nom, String prenom) {
        super(identifiant, motDePasse, addresseMail);
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public ArrayList<Commande> getListeCommandeClient() {
        return listeCommandeClient;
    }

    public void setListeCommandeClient(ArrayList<Commande> listeCommandeClient) {
        this.listeCommandeClient = listeCommandeClient;
    }

    public void listProduits() {
        Magasins.imprimerLaListe();
    }

/*public void AjoutProduitDansPanier() {
        String nomDuProduit = null;
        int quantiteDuProduit = 0;
        double prixDuProduit = 0;
        int referenceDuProduit = 0;

        while (NomDuProduit == null || QuantiteDuProduit == 0 || PrixDuProduit == 0 || ReferenceDuProduit == 0) {
            System.out.println("Nom Produit : ");
            NomDuProduit = scanner.nextLine();

            System.out.println("Quantite : ");
            QuantiteDuProduit = scanner.nextInt();

            System.out.println("Prix : ");
            PrixDuProduit = scanner.nextDouble();

            System.out.println("Reference : ");
            ReferenceDuProduit = scanner.nextInt();

            scanner.nextLine();
            System.out.println();

        }
    }*/
}