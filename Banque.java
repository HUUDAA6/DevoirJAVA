package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class Banque {

    private String id;
    private String pays;
    private ArrayList<Client> clients = new ArrayList<>();
    private ArrayList<Compte> comptes = new ArrayList<>();

    public Banque(String id, String pays) {
        this.id = id;
        this.pays = pays;
    }

    public Banque(String id) {
        this.id = id;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public void ajouterClient(Client client) {
        clients.add(client);
    }

    public Client rechercherClient(String nomClient) {
        for (Client client : clients) {
            if (client.getNomClient().equals(nomClient)) {
                return client;
            }
        }
        return null; // Client not found
    }

    public void creerCompte(Compte compte) {
        comptes.add(compte);
    }

    public Compte getCompte(String numCompte) {
        for (Compte compte : comptes) {
            if (Objects.equals(compte.getNumCompte(), numCompte)) {
                return compte;
            }
        }
        return null; // Account not found
    }

}
