package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuAdministrateur {

    public MenuAdministrateur() {

        /********************************************************/
        /**************  Affichage du menu Client  **************/
        /********************************************************/

        System.out.println("Vous êtes connecté en tant qu'administrateur");
        System.out.println("Tapez le numéro correspondant à l'action souhaitée");
        System.out.println("1 Liste des produits");
        System.out.println("2 Ajouter un produit");
        System.out.println("3 Déconnexion");

        // on crée des produits
        Magasins magasins = new Magasins("AmazonSofia",St);
        Produits produits1 = new Produits("Chocolat",40,5.5,1);
        Produits produits2 = new Produits("Chocolat aux lait",40,5.5,1);
        ArrayList<Produits> stockProduit = new ArrayList<Produits>();
        stockProduit.add(produits1);
        stockProduit.add(produits2);
        // Gestion des choix du menuClient + création des instances des éléments choisis
        Scanner sc = new Scanner(System.in);
        int Choix;
        Choix = sc.nextInt();

        switch (Choix) {

            case 1:
                new Administrateur().getListeDeproduitsDesAdministrateurs();

        case 2:
            new Administrateur.Ajoutproduit();

        case 3:
        System.out.println("EXIT");
        Menu.Menu1();
            //System.exit(0);
    }
}
}


