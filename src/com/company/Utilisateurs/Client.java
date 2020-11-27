package com.company.utilisateurs;

import com.company.core.Commande;
import com.company.core.Magasins;
import java.util.Scanner;
import java.util.ArrayList;

public class Client extends Utilisateurs {
    private static Scanner scanner;
    private String nom;
    private String prenom;
    private ArrayList<Commande> listeCommandeClient;

    public Client(int identifiant, int motDePasse, String addresseMail, String nom, String prenom) {
        super(identifiant, motDePasse, addresseMail);
        this.nom = nom;
        this.prenom = prenom;
        this.listeCommandeClient = new ArrayList<>();
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

/*public static void AjoutProduitDansPanier() {
        String nomDuProduit = null;
        int quantiteDuProduit = 0;
        double prixDuProduit = 0;
        int referenceDuProduit = 0;

        while (nomDuProduit== null || quantiteDuProduit == 0 || prixDuProduit == 0 || referenceDuProduit == 0) {
            System.out.println("Nom Produit : ");
            nomDuProduit = scanner.nextLine();

            System.out.println("Quantite : ");
            quantiteDuProduit = scanner.nextInt();

            System.out.println("Prix : ");
            prixDuProduit = scanner.nextDouble();

            System.out.println("Reference : ");
            referenceDuProduit = scanner.nextInt();

            scanner.nextLine();
            System.out.println();

        }
    }*/
}