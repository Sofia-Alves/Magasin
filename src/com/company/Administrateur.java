package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Administrateur extends Utilisateurs {
private String Nom;


    public Administrateur(int identifiant, int motDePasse, String addresseMail, String nom) {
        super(identifiant, motDePasse, addresseMail);
        Nom = nom;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }
    //************************* METHODE DE RAJOUT DE PRODUIT****************************

    public void AjoutProduit(Magasins magasins) {


        boolean isInProgress = true;
        while (isInProgress) {

            //On instancie un scanner
            Scanner myScanner = new Scanner(System.in);

            //On indique à l'utilisateur ce qu'il va devoir saisir dans le Scanner

            System.out.println("Merci d'indiquer les informations de votre Article séparés par le caractère / " +
                    "(nom, prix, quantite, reference) Pour Quitter la saisie merci de presser la lettre Q");
            //On indique que la saisie utilisateur doit être stocké dans une string

            String result = myScanner.nextLine();
            //On vérifie que l'utilisateur ne souhaite pas arrêter de saisir des produits par l'intermédiaire de la lettre Q

            if (result.equalsIgnoreCase("Q")) {
                isInProgress = false;
            } else {//on va diviser notre string en sous string dans un tableau de String

                String ListedeProduitTab[] = result.split("/");
                //********On parcourt notre liste de produit pour verifier que le produit est existant ou non


                for (int i = 0; i < magasins.getListeProduitsDuMagasin().size(); i++) {
                    //******   si le produit est existant on ne rajoute que la quantite
                    if (ListedeProduitTab[0] == magasins.getListeProduitsDuMagasin().get(i).getNom()) {

                        int NbProduit;
                        NbProduit = Integer.parseInt(ListedeProduitTab[2]);
                        //******       si le produit est existant on ne rajoute que la quantite
                        magasins.getListeProduitsDuMagasin().get(i).setQuantite(magasins.getListeProduitsDuMagasin().get(i).getQuantite() + NbProduit);
                        System.out.println(magasins.getListeProduitsDuMagasin().get(i).getQuantite() + " est votre nouvelle quantitée de produit");
                        isInProgress = false;
                    } else {

                        Produits ProduitARajouter = new Produits(ListedeProduitTab[0].trim(),Double.parseDouble(ListedeProduitTab[1].trim()),Integer.parseInt(ListedeProduitTab[2].trim()),Integer.parseInt(ListedeProduitTab[3].trim()));

                        magasins.getListeProduitsDuMagasin().add(ProduitARajouter);
                        System.out.println( " Nouveau produit rajouté. ");
                        isInProgress = false;
                    }
                }
            }
        }
    }

    public void ImprimerLaListe(Magasins magasins) {
        for (int i = 0; i < magasins.getListeProduitsDuMagasin().size(); i++) {
            if (magasins.getListeProduitsDuMagasin().get(i) != null) {
                System.out.println("Nom : " + magasins.getListeProduitsDuMagasin().get(i).getNom() + " quantite " + magasins.getListeProduitsDuMagasin().get(i).getQuantite()
                        + " prix : " + magasins.getListeProduitsDuMagasin().get(i).getPrix() + " reference " + magasins.getListeProduitsDuMagasin().get(i).getReference());
            }

        }
    }
}










