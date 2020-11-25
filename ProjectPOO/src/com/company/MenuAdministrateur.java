package com.company;
import java.util.Scanner;
public class MenuAdministrateur {

    public MenuAdministrateur(Administrateur administrateur){

        /********************************************************/
        /**************  Affichage du menu Client  **************/
        /********************************************************/

        System.out.println("Vous êtes connecté en tant qu'administrateur");
        System.out.println("Tapez le numéro correspondant à l'action souhaitée");
        System.out.println("1 Liste des produits");
        System.out.println("2 Ajouter un produit");
        System.out.println("3 Déconnexion");
        // Gestion des choix du menuClient + création des instances des éléments choisis
         Scanner sc = new Scanner(System.in);
        int Choix;
        Choix = sc.nextInt();

        switch (Choix){

            case 1 :
                new Administrateur(administrateur)

            case 2 :


            case 3 :
                System.out.println("EXIT");
                System.exit(0);
        }
    }
}


