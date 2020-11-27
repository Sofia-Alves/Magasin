package com.company.menu;

import com.company.utilisateurs.Administrateur;
import com.company.core.Magasins;
import java.util.Scanner;

public class MenuAdministrateur {

    public MenuAdministrateur(){
        affichageMenuAdministrateur();
    }

    private void affichageMenuAdministrateur() {
        int choix;
        boolean isInprogress = true;
        Administrateur admin1;
        /********************************************************/
        /**************  Affichage du menu Administrateur *******/
        /********************************************************/

        System.out.println("Vous êtes connecté en tant qu'administrateur");
        System.out.println("Tapez le numéro correspondant à l'action souhaitée");
        System.out.println("\t- 1 Liste des produits");
        System.out.println("\t- 2 Ajouter un produit");
        System.out.println("\t- 3 Déconnexion");
        // Gestion des choix du menuClient + création des instances des éléments choisis
        Scanner sc = new Scanner(System.in);

        choix = sc.nextInt();

        while(isInprogress) {
            switch(choix) {
                case 1:
                    Magasins.imprimerLaListe();
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
                    affichageMenuAdministrateur();
                    break;
            }
        }
    }
}




