package com.company.Menu;

import java.util.Scanner;

public class Menu {

    public Menu() {
        creerMenuPrincipal();
    }

    private void creerMenuPrincipal(){
        int choix;
        boolean isInprogress = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue");
        System.out.println("Tapez le numéro correspondant à l'action souhaitée");
        System.out.println("\t- 1 Se connecter en tant que Client");
        System.out.println("\t- 2 Se connecter en tant qu'Administrateur");
        System.out.println("\t- 3 Exit");

        // Gestion des choix du menuPrincipal + création des instances des éléments choisis
        Scanner sc = new Scanner(System.in);

        choix = sc.nextInt();

        while (isInprogress) {
            switch (choix){
                case 1 :
                    isInprogress = false;
                    MenuClient mClient = new MenuClient();
                    break;
                case 2 :
                    MenuAdministrateur mAdmin = new MenuAdministrateur();
                    isInprogress = false;
                    break;
                case 3 :
                    System.out.println("EXIT");
                    System.exit(0);
                default:
                    System.out.println("Je n'ai pas compris votre choix.\n Merci de choisir :");
                    isInprogress = false;
                    creerMenuPrincipal();
            }
        }
    }
}




