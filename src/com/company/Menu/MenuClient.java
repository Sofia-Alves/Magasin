package com.company.Menu;

import com.company.Utilisateurs.Client;


import java.util.Scanner;

public class MenuClient {
    public MenuClient() {
        affichageMenuClient();
    }
/********************************************************/
/**************  Affichage du menu Client  **************/
/********************************************************/

    public void affichageMenuClient() {
        int choix;
        boolean isInprogress = true;


        System.out.println("Vous êtes connecté en tant que Client");
        System.out.println("Tapez le numéro correspondant à l'action souhaitée");
        System.out.println("\t- 1 Liste des produits");
        System.out.println("\t- 2 Panier");
        System.out.println("\t- 3 Déconnexion");

        // Gestion des choix du menuClient + création des instances des éléments choisis
        Scanner sc = new Scanner(System.in);
        choix = sc.nextInt();

        while(isInprogress) {
            switch(choix) {
                case 1:
                   //mettre la methode qui affiche la liste des porduits

                    isInprogress = false;
                    break;
                case 2:
                    isInprogress = false;
                    break;
                case 3:
                    System.out.println("Deconnexion");
                    System.exit(0);
                default:
                    System.out.println("Je ne comprends pas votre choix.\n Merci de faire un choix parmis :");
                    affichageMenuClient();
            }
        }
    }
}