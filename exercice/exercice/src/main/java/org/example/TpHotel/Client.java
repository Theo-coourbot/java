package org.example.TpHotel;

import java.util.ArrayList;
import java.util.List;

public class Client {
    String nom;
    String prenom;
    String phone;

    List<Resevation> resevations;

    public Client(String nom, String prenom, String phone) {
        this.nom = nom;
        this.prenom = prenom;
        this.phone = phone;
        this.resevations = new ArrayList<>();
    }

    public Client() {

    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
