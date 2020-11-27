package com.company.utilisateurs;

import com.company.core.Magasins;
import com.company.core.Produits;
import com.company.menu.MenuAdministrateur;

import java.util.ArrayList;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Administrateur extends Utilisateurs {
    private static Magasins magasins;
    private String nom;
    private String prenom;

    public Administrateur(int identifiant, int motDePasse, String addresseMail, String nom, String prenom) {
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
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    //************************* METHODE DE RAJOUT DE PRODUIT****************************

  public static void AjoutProduit() {

        boolean isInProgress = true;
        while(isInProgress) {
            //On instancie un scanner
            Scanner myScanner = new Scanner(System.in);

            //On indique à l'utilisateur ce qu'il va devoir saisir dans le Scanner

            System.out.println("Merci d'indiquer les informations de votre Article séparés par le caractère / " +
                    " (nom, prix (précisez un nombre avec un point ex : 10.5), quantitée ,reference) Pour Quitter la saisie merci de presser la lettre Q");
            //On indique que la saisie utilisateur doit être stocké dans une string

            String result = myScanner.nextLine();
            //On vérifie que l'utilisateur ne souhaite pas arrêter de saisir des produits par l'intermédiaire de la lettre Q

            //on va diviser notre string en sous string dans un tableau de String

            String ListedeProduitTab[] = result.split("/");
            //********On parcourt notre liste de produit pour verifier que le produit est existant ou non


            if(result.equalsIgnoreCase("Q")) {
                isInProgress = false;
            } else {
                //on crée une Arraylist Vide
                ArrayList<String> listenomproduit = new ArrayList<>();
                //pour tous les produit de notre Array List de produit, on recuperer le nom de produit et on l'ajoute a notre liste vide
                for(int i = 0; i < magasins.getListeProduitsDuMagasin().size(); i++) {
                    listenomproduit.add(magasins.getListeProduitsDuMagasin().get(i).getNom());
                }

                //la methode contains permet de tester si un mot est présent dans une liste.
                //on regarde si le mot saisie par l'utilisateur est present dans la liste de nom de produit, s'il est prséent ça veut dire qu'on doit juste ajouter du stock
                if(listenomproduit.contains(ListedeProduitTab[0])) {
                    //on parcours tout les produit de notre liste de produit
                    for(int i = 0; i < magasins.getListeProduitsDuMagasin().size(); i++) {
                        //on crée un variable qui stock le nom du produit a l'indice i dans la liste de produit
                        String test = magasins.getListeProduitsDuMagasin().get(i).getNom();
                        //.equals permet de comparer 2 string si elles sont egale retourne true
                        //Si le nom du produit a l'indice i est egal a la saisie utilisateur correspondant au nom de l'article
                        if(test.equals(ListedeProduitTab[0])) {
                            int NbProduit;
                            //on ajoute la quantité saisie par l'utilisateur a la quantité de base
                            NbProduit = Integer.parseInt(ListedeProduitTab[3]);
                            magasins.getListeProduitsDuMagasin().get(i).setQuantitee(magasins.getListeProduitsDuMagasin().get(i).getQuantitee() + NbProduit);
                            System.out.println(magasins.getListeProduitsDuMagasin().get(i).getQuantitee() + " est votre nouvelle quantitée de produit");

                            break;

                        }

                    }
                    //Si le mot saisie par l'utilisateur n'est pas présent dans la liste de nom de produit, on crée un nouveau produit
                } else {

                    Produits ProduitARajouter = new Produits(ListedeProduitTab[0].trim(), Double.parseDouble(ListedeProduitTab[1].trim()), Integer.parseInt(ListedeProduitTab[2].trim()), Integer.parseInt(ListedeProduitTab[3].trim()));

                    magasins.getListeProduitsDuMagasin().add(ProduitARajouter);
                    System.out.println(" Nouveau produit rajouté. ");
                    break;
                }
            }
        }
    }
}