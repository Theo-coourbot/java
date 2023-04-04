package org.example.Poo.Tp2Heritage.Exo2;

public class Appartement extends House {


    public Appartement(float surface) {
        super(50);
    }

    @Override
    public void display() {
        System.out.println("Je suis un appartement, ma surface est de " + surface + " m²");
    }

}
