package com.company;

import com.company.core.Commande;
import com.company.core.Magasins;
import com.company.core.Produits;
import com.company.menu.MenuPrincipal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Produits produits1 = new Produits("chocolat", 5.5, 11, 10);
        Produits produits2 = new Produits("fraise", 5.8, 12, 20);
        Produits produits3 = new Produits("vanille", 10.7, 13, 70);
        // jeu de test pour creer nos listes

        ArrayList<Produits> StockProduit = new ArrayList();

        StockProduit.add(produits1);
        StockProduit.add(produits2);
        StockProduit.add(produits3);

        Magasins magasins = new Magasins("amazon");

        magasins.ajoutProduits(StockProduit);
        ArrayList<Produits> StockCommande1 = new ArrayList<>();
        StockCommande1.add(produits1);
        ArrayList<Produits> StockCommande2 = new ArrayList<>();
        StockCommande2.add(produits2);
        ArrayList<Produits> StockCommande3 = new ArrayList<>();
        StockCommande3.add(produits3);


        MenuPrincipal menuPrincipale = new MenuPrincipal();






















        //cree une commande


        /*Administrateur administrateur = new Administrateur(123, 543, "dfghdf@gmail.com", "LO");

        Commande nouvelleCommande = new Commande(10, produits1 );
        Commande nouvelleCommande2 = new Commande(20, produits2);

        ArrayList<Commande> ListeDeCommande = new ArrayList<Commande>();

        ListeDeCommande.add(nouvelleCommande);
        ListeDeCommande.add(nouvelleCommande2);

        Client client = new Client(567, 1209, "RE@GMAIL.COM", "Dupont", "François", ListeDeCommande);
       *//* administrateur.AjoutProduit(magasins);
        administrateur.ImprimerLaListe(magasins);

        menu m1 = new menu();
        MenuAdministrateur mA = new MenuAdministrateur();
        MenuClient mC = new MenuClient();*//*
        nouvelleCommande.Commander(client,magasins);
        System.out.println(client.getListeDeCommandeDesClients().get(2).getPrix());
*/

    }
}
