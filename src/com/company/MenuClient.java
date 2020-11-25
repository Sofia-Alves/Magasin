package com.company;
import java.util.Scanner;
public class MenuClient {

    public MenuClient(){

        /********************************************************/
        /**************  Affichage du menu Client  **************/
        /********************************************************/

        System.out.println("Vous êtes connecté en tant que Client");
        System.out.println("Tapez le numéro correspondant à l'action souhaitée");
        System.out.println("1 Liste des produits");
        System.out.println("2 Panier");
        System.out.println("3 Déconnexion");
        // Gestion des choix du menuClient + création des instances des éléments choisis
        Scanner sc = new Scanner(System.in);
        int Choix;
        Choix = sc.nextInt();

        switch (Choix){
            case 1 :
                //liste des produits qui saffiche

            case 2 :
               // new Panier();
            case 3 :
                System.out.println("EXIT");
               Menu.Menu1();

        }
    }
}
