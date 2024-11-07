package org.example;
import java.util.List;
public class Client {
    private String numClient;
    private String nom;
    private String prenom;
    private String adresse;
    private String phone;
    private String email;
    private String pays;
    private List<Compte> comptes;

    public Client(String numClient, String nom, String prenom, String adresse, String phone, String email) {
        this.numClient = numClient;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.phone = phone;
        this.email = email;
    }

    public Client(String numClient, String nom) {
        this.numClient = numClient;
        this.nom = nom;
    }

    public String getNumClient() {
        return this.numClient;
    }


    public void setNumClient(String numClient) {
        this.numClient = numClient;
    }
    public String getNomClient() {
        return this.numClient;
    }
    public String getPays() {
        return this.pays;
    }
}
