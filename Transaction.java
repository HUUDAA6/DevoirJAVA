package org.example;
import org.example.Banque;
import org.example.Client;
import org.example.TransactionType;

import java.util.Date;

public class Transaction{
    private TransactionType type;
    private Date timeStamp;
    private String reference;
    private double montant;
    private Client client1;
    private Client client2;
    private Banque banque1;
    private Banque banque2;

    public Transaction(Compte compte1, Compte compte2, double v, Banque banque1, Banque banque11, String france, String france1) {
    }


    public TransactionType determineTypeTransaction() {
        if (banque1.equals(banque2)) {
            this.type = TransactionType.VIRINI;
            return type.VIRINI;
        } else if (client1.getPays().equals(client2.getPays())) {
            this.type = TransactionType.VIREST;
            return type.VIREST;
        } else if (!banque1.equals(banque2) && client1.getPays().equals(client2.getPays())) {
            this.type = TransactionType.VIRMULTA;
            return type.VIRMULTA;
        } else {
            this.type = TransactionType.VIRHAC;
            return type.VIRHAC;
        }
    }
    @Override
    public String toString() {
        return "Transaction [type=" + type + ", timeStamp=" + timeStamp + ", reference=" + reference +
                ", montant=" + montant + ", client1=" + client1 + ", client2=" + client2 +
                ", banque1=" + banque1 + ", banque2=" + banque2 + "]";
    }
}

