package com.company;

import com.company.Menu.Menu;
import com.company.Menu.MenuAdministrateur;
import com.company.Menu.MenuClient;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MenuAdministrateur menuAdministrateur = new MenuAdministrateur();
        MenuClient menuClient = new MenuClient();

        Produits produits1 = new Produits("chocolat",5.5,11,10);
        Produits produits2 = new Produits("fraise",5.8,12,20);
        Produits produits3 = new Produits("vanille",10.7,13,70);
        // jeu de test pour creer nos listes

        ArrayList <Produits> StockProduit = new ArrayList<Produits>();

        StockProduit.add(produits1);
        StockProduit.add(produits2);
        StockProduit.add(produits3);

        Magasins magasins = new Magasins("amazon",StockProduit);
        ArrayList <Produits> StockCommande1= new ArrayList<Produits>();
        StockCommande1.add(produits1);
        ArrayList<Produits> StockCommande2 = new ArrayList<Produits>();
        StockCommande2.add(produits2);
        ArrayList<Produits> StockCommande3 = new ArrayList<Produits>();

        //cree une commande


        Administrateur administrateur = new Administrateur(123,543,"dfghdf@gmail.com","LO");

        Commande nouvelleCommande =new Commande(10,11.0,StockCommande1);
        Commande nouvelleCommande2 = new Commande(20,5.8,StockCommande2);

        ArrayList<Commande> ListeDeCommande = new ArrayList<Commande>();

        ListeDeCommande.add(nouvelleCommande);
        ListeDeCommande.add(nouvelleCommande2);

        Client client = new Client(567,1209,"RE@GMAIL.COM","Dupont","François",ListeDeCommande);
        administrateur.AjoutProduit(magasins);
        System.out.println(magasins.getListeProduitsDuMagasin().get(3).getNom());

Menu.Menu1();

    }
}
