package com.company.core;

public class Commande {
    private double prix;
    private Produits listeDesProduits;

    public Commande(double prix, Produits listeDesProduits) {
        this.prix = prix;
        this.listeDesProduits = listeDesProduits;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Produits getListeDesProduits() {
        return listeDesProduits;
    }

    public void setListeDesProduits(Produits listeDesProduits) {
        this.listeDesProduits = listeDesProduits;
    }

/*    public void Commander(Client client, Magasins magasins) {
        magasins.getListeProduitsDuMagasin();
        Scanner scanner = new Scanner(System.in);

        String NomDuProduit = null;
        int QuantiteDuProduit = 0;

        System.out.println("Nom Produit : ");
        NomDuProduit = scanner.nextLine();
        NomDuProduit= NomDuProduit.toLowerCase();

        System.out.println("Quantite : ");
        QuantiteDuProduit = scanner.nextInt();


        ArrayList<String> container = new ArrayList<>();
        // on verifie que le produit existe
        for (int i = 0; i < magasins.getListeProduitsDuMagasin().size(); i++) {
            container.add(magasins.getListeProduitsDuMagasin().get(i).getNom());
            //contains: fonction qui regarde si un mot est dans une liste.
        }
        if (container.contains(NomDuProduit)) {
            System.out.println("Le produit existe");
            for (int j = 0; j < magasins.getListeProduitsDuMagasin().size(); j++) {
                String object = magasins.getListeProduitsDuMagasin().get(j).getNom();
                //si on verifie pas avant que le produit existe on pourra pas faire la 2e iteration.
                if (object.equals(NomDuProduit)) {
                    if (magasins.getListeProduitsDuMagasin().get(j).getQuantitee()-QuantiteDuProduit<0) {
                        System.out.println("Quantitée en stock insufisante");
                    }else{
                        magasins.getListeProduitsDuMagasin().get(j).setQuantitee(magasins.getListeProduitsDuMagasin().get(j).getQuantitee() - QuantiteDuProduit);
                        //on dit à l'utilisateur , le produit est valide et recupère sa quantité et on la retire de la quantité globale
                        Double quantitée = new Double(QuantiteDuProduit);
                        Double prix = (magasins.getListeProduitsDuMagasin().get(j).getPrix()) * quantitée;
                        Produits produitsDeCommande = new Produits(magasins.getListeProduitsDuMagasin().get(j).getNom(),
                                magasins.getListeProduitsDuMagasin().get(j).getPrix(),
                                magasins.getListeProduitsDuMagasin().get(j).getReference(),
                                magasins.getListeProduitsDuMagasin().get(j).getQuantitee());
                        Commande commande = new Commande(prix, produitsDeCommande);
                        client.getListeDeCommandeDesClients().add(commande);
                        System.out.println("Votre commande à bien été effectuée");
                    }
                }
            }
        } else {
            System.out.println("Produit non existant, veuillez saisir un nom de produit à nouveau");

        }
        scanner.nextLine();
        System.out.println();
    }*/
}

