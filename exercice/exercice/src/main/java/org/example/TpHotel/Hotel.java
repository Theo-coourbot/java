package org.example.TpHotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    String name;
    List<Chambre> numberChambre;
    static int  count = 0;

    List<Resevation> resevations;
    List<Client> clients;

    public Hotel() {
        this.name = "theotel";
        this.numberChambre = new ArrayList<>();
        this.resevations = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    {
        count++;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", numberChambre=" + numberChambre +
                ", resevations=" + resevations +
                ", clients=" + clients +
                '}';
    }
}
