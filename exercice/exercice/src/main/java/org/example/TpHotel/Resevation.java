package org.example.TpHotel;

import java.util.Date;

public class Resevation {

    String Date;
    Boolean status;

    String name;
    int numero;


    public Resevation( String date, Boolean status, String name, int numero) {

        Date = date;
        this.status = status;
        this.name = name;
        this.numero = numero;
    }
}
