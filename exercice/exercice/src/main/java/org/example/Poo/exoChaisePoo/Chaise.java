package org.example.Poo.exoChaisePoo;

public class Chaise {
    private  int nbPied;
    private  String matiere;
    private  String  color;

    public Chaise(int nbPied, String matiere, String color) {
        this.nbPied = nbPied;
        this.matiere = matiere;
        this.color = color;
    }

    public Chaise() {
    }

    public static void affiche(Chaise chaise){
        System.out.println("nombre de pied : " + chaise.nbPied + " matiere : " + chaise.matiere + " et est de couleur : " + chaise.color);

    }

    @Override
    public String toString() {
        return "Chaise{" +
                "nbPied=" + nbPied +
                ", matiere='" + matiere + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
