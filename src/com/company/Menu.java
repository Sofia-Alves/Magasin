package com.company;

import java.util.Scanner;

public class Menu {

    public static void Menu1() {
        Scanner scanner = new Scanner(System.in);
        //Register register = new Register("Id", "password");

        System.out.println("Bienvenue");
        System.out.println("Tapez le numéro correspondant à l'action souhaitée");
        System.out.println("1 Se connecter en tant que Client");
        System.out.println("2 Se connecter en tant qu'Administrateur");
        System.out.println("3 Exit");

        // Gestion des choix du menuPrincipal + création des instances des éléments choisis

        int Choix;
        Choix = scanner.nextInt();

        switch (Choix) {
            case 1:
                new MenuClient();
            case 2:
                new MenuAdministrateur();
            case 3:
                System.out.println("EXIT");
                System.exit(0);
        }
    }
}






