package com.company.Utilisateurs;

import com.company.Commande;
import com.company.Magasins;
import com.company.Utilisateurs.Utilisateurs;

import java.util.ArrayList;

public class Client extends Utilisateurs {
    private String Nom;
    private String Prenom;
    private ArrayList<Commande> ListeDeCommandeDesClients;

    public Client(int identifiant, int motDePasse, String addresseMail, String nom, String prenom, ArrayList<Commande> listeDeCommandeDesClients) {
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

    public ArrayList<Commande> getListeDeCommandeDesClients() {
        return ListeDeCommandeDesClients;
    }

    public void setListeDeCommandeDesClients(ArrayList<Commande> listeDeCommandeDesClients) {
        ListeDeCommandeDesClients = listeDeCommandeDesClients;
    }


    public void voirListeProduit(){

        System.out.println("Liste des Produits");

        Magasins magasins = new Magasins();
        for (int i = 0; i < magasins.getListeProduitsDuMagasin().size(); i++) {
            if (magasins.getListeProduitsDuMagasin().get(i) != null) {
                System.out.println("Nom : " + magasins.getListeProduitsDuMagasin().get(i).getNom() + " quantite " + magasins.getListeProduitsDuMagasin().get(i).getQuantitee()
                        + " prix : " + magasins.getListeProduitsDuMagasin().get(i).getPrix() + " reference " + magasins.getListeProduitsDuMagasin().get(i).getReference());
            }

        }


    }


    public void AjoutProduitDansPanier() {
        String NomDuProduit = null;
        int QuantiteDuProduit = 0;
        double PrixDuProduit = 0;
        int ReferenceDuProduit = 0;

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

    }

}


// le client doit avoir l'accès à la liste des produits

