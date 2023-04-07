package org.example.TpHotel;

import java.util.Date;

public class Resevation {

    int numero;
    Boolean status;
    int chambrenumber;

    String name;



    public Resevation( int numero, Boolean status, String name , int chambrenumber) {

        this.numero = numero;
        this.status = status;
        this.name = name;
        this.chambrenumber=chambrenumber;

    }

    @Override
    public String toString() {
        return "Resevation{" +
                "numero=" + numero +
                ", status=" + status +
                ", chambrenumber=" + chambrenumber +
                ", name='" + name + '\'' +
                '}';
    }
}
