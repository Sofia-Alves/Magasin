package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Administrateur extends Utilisateurs {

    private String NomSociete;
    Magasins magasinsAjoutAdmi = new Magasins();

    /*public Administrateur(int identifiant, int motDePasse, String addresseMail, String nomSociete, ArrayList<Produits> listeDeproduitsDesAdministrateurs) {
        super(identifiant, motDePasse, addresseMail);
        NomSociete = nomSociete;
        ListeDeproduitsDesAdministrateurs = listeDeproduitsDesAdministrateurs;
    }*/

    public String getNomSociete() {

        return NomSociete;
    }

    public void setNomSociete(String nomSociete) {

        NomSociete = nomSociete;
    }

    public ArrayList<Produits> getListeDeproduitsDesAdministrateurs() {

        return ListeDeproduitsDesAdministrateurs;
    }

    public void setListeDeproduitsDesAdministrateurs(ArrayList<Produits> listeDeproduitsDesAdministrateurs) {

        ListeDeproduitsDesAdministrateurs = listeDeproduitsDesAdministrateurs;
    }

//************************* METHODE DE RAJOUT DE PRODUIT****************************




    public void AjoutProduit() {

        boolean isInProgress = true;
        while (isInProgress) {

            //On instancie un scanner
            Scanner myScanner = new Scanner(System.in);

            //On indique à l'utilisateur ce qu'il va devoir saisir dans le Scanner

            System.out.println("Merci d'indiquer les informations de votre Article séparés par le caractère / " +
                    "(nom, quantite, prix,reference) Pour Quitter la saisie merci de presser la lettre Q");
            //On indique que la saisie utilisateur doit être stocké dans une string

            String result = myScanner.nextLine();
            //On vérifie que l'utilisateur ne souhaite pas arrêter de saisir des produits par l'intermédiaire de la lettre Q

            if (result.equalsIgnoreCase("Q")) {
                isInProgress = false;
            } else {//on va diviser notre string en sous string dans un tableau de String

                            String ListedeProduitTab[] = result.split("/");
                //********On parcourt notre liste de produit pour verifier que le produit est existant ou non


                for (int i = 0; i < this.getListeDeproduitsDesAdministrateurs().size(); i++) {
                    //******   si le produit est existant on ne rajoute que la quantite
                    if (ListedeProduitTab[0] == this.getListeDeproduitsDesAdministrateurs().get(i).getNom()) {

                        int NbProduit;
                        NbProduit = Integer.parseInt(ListedeProduitTab[1]);
                        //******       si le produit est existant on ne rajoute que la quantite
                        this.getListeDeproduitsDesAdministrateurs().get(i).setQuantite(getListeDeproduitsDesAdministrateurs().get(i).getQuantite() + NbProduit);

                    } else {

                        Produits ProduitARajouter = new Produits(ListedeProduitTab[0].trim(), Integer.parseInt(ListedeProduitTab[1].trim()), Double.parseDouble(ListedeProduitTab[2]),
                                Integer.parseInt(ListedeProduitTab[3]));
                        this.getListeDeproduitsDesAdministrateurs().add(ProduitARajouter);

                    }
                }
            }
        }
    }
}
