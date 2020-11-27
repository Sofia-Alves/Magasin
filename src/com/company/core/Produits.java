package com.company.core;

public class Produits {
    private String nom;
    private Double prix;
    private int quantitee;
    private int reference;

    public Produits(String nom, Double prix, int quantite, int reference) {
        this.nom = nom;
        this.quantitee = quantite;
        this.prix = prix;
        this.reference = reference;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantitee() {
        return quantitee;
    }

    public void setQuantitee(int quantitee) {
        this.quantitee = quantitee;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }
}