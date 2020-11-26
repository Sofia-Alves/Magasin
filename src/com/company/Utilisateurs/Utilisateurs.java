package com.company.Utilisateurs;

import java.util.ArrayList;
import java.util.Scanner;

public class Utilisateurs {
private int Identifiant;
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

}
