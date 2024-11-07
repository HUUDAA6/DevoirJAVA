package org.example;
import java.util.Date;

import java.util.List;

public class Compte {
    private String numCompte;
    private Date dateCreation;
    private Date dateUpdate;
    private double solde;
    private Client client;
    private List<Transaction> transactions;


    public Compte(String numcompte, double solde) {
        this.numCompte = numcompte;
        this.solde = solde;
    }
    public String getNumCompte() {
        return numCompte;
    }

}