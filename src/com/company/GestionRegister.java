package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionRegister {

    ArrayList<Register> listeRegisterPourAdmin = null;

    public GestionRegister(ArrayList<Register> listeRegisterPourAdmin) {
        this.listeRegisterPourAdmin = listeRegisterPourAdmin;
    }

    //liste des registres


    public static void creeUnCompte() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("/n Avez vous un compte Administrateur");
        System.out.println("/n 1 - oui");
        System.out.println("/n 2 - non");
        int choix2;
        choix2 = scanner.nextInt();

        switch (choix2){

        }


    }
}