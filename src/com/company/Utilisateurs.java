package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Utilisateurs {
    private int Identifiant;
    private int MotDePasse;
    private String AdresseMail;

    Scanner scanner = new Scanner(System.in);

    public Utilisateurs(int identifiant, int motDePasse, String adresseMail) {
        Identifiant = identifiant;
        MotDePasse = motDePasse;
        AdresseMail = adresseMail;

    }

    public Utilisateurs() {

    }

    public int getIdentifiant() {
        return Identifiant;

    }

    public void setIdentifiant(int identifiant) {
        Identifiant = identifiant;
    }

    public int getMotDePasse() {
        return MotDePasse;
    }

    public void setMotDePasse(int motDePasse) {
        MotDePasse = motDePasse;
    }

    public String getAdresseMail() {
        return AdresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        AdresseMail = adresseMail;

    }

    //utilisateur du while pour faire une boucle qui redemande des produits à l'utilisateur.

    public Utilisateurs AjoutProduitPanier(Administrateur administrateur,Produits produits,ArrayList<ListeDeproduitsDesAdministrateurs> listePourPanier) {

        boolean isInProgress = true;
        while (isInProgress) {

            //On instancie un scanner
            Scanner myScanner = new Scanner(System.in);

            //On indique à l'utilisateur ce qu'il va devoir saisir dans le Scanner

            System.out.println("Merci d'indiquer la reference de l'article avec un nombre");
            System.out.println("Pour Quitter la saisie et voir votre Pannier entré la lettre P");
            System.out.println("Pour Quitter la saisie merci de presser la lettre Q");


            //On indique que la saisie utilisateur doit être stocké dans une string

            String result = myScanner.nextLine();

            //On vérifie que l'utilisateur ne souhaite pas arrêter de saisir des produits par l'intermédiaire de la lettre Q

            if (result.equalsIgnoreCase("Q")) {
                isInProgress = false;
            } else {//on va diviser notre string en sous string dans un tableau de String

                int PanierdeProduitTab[] = result;

                //********On parcourt notre liste de produit pour verifier que le produit est existant ou non

                for (int i = 0; i < this.getListeDeproduitsDesAdministrateurs().size(); i++) {


                    //******   si le produit est existant on ne rajoute que le produit
                    if (PanierdeProduitTab[0] == this.getListeDeproduitsDesAdministrateurs().get(i).getReference()) {

                        int NbProduit;
                        NbProduit = Integer.parseInt(ListedeProduitTab[1]);

                        //******       si le produit est existant on ne rajoute que la quantite
                        this.getListeDeproduitsDesAdministrateurs().get(i).setQuantite(getListeDeproduitsDesAdministrateurs().get(i).getQuantite() + NbProduit);

                    } else {

                        Produits ProduitARajouter = new Produits(ListedeProduitTab[0].trim(), Integer.parseInt(ListedeProduitTab[1].trim()), Double.parseDouble(ListedeProduitTab[2]),
                                Integer.parseInt(ListedeProduitTab[3]));
                        this.getListeDeproduitsDesAdministrateurs().add(ProduitARajouter);

                    }
                }
            }
        }
    }

}
