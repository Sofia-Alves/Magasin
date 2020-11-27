package com.company.utilisateurs;

public class Utilisateurs {
    private int identifiant;
    private int motDePasse;
    private String addresseMail;

    public Utilisateurs(int identifiant, int motDePasse, String addresseMail) {
        this.identifiant = identifiant;
        this.motDePasse = motDePasse;
        this.addresseMail = addresseMail;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public int getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(int motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getAddresseMail() {
        return addresseMail;
    }

    public void setAddresseMail(String addresseMail) {
        this.addresseMail = addresseMail;
    }

/*    private int Identifiant;
    private int MotDePasse;
    private String AddresseMail;

    Scanner scanner = new Scanner(System.in);
    public Utilisateurs(int identifiant, int motDePasse, String addresseMail) {
        Identifiant = identifiant;
        MotDePasse = motDePasse;
        AddresseMail = addresseMail;

    }

    public int getIdentifiant() {
        return Identifiant;
    }

    public void setIdentifiant(int identifiant) {
        Identifiant = identifiant;
    }

    public int getMotDePasse() {
        return MotDePasse;
    }

    public void setMotDePasse(int motDePasse) {
        MotDePasse = motDePasse;
    }

    public String getAddresseMail() {
        return AddresseMail;
    }

    public void setAddresseMail(String addresseMail) {
        AddresseMail = addresseMail;

    }
    */
}
