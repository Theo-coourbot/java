package org.example.Poo.TpEmploye4bis;

public class Employe {
     String nom;
     int age;
     int  salaire;

    public Employe(String nom, int age, int salaire) {
        this.nom = nom;
        this.age = age;
        this.salaire = salaire;
    }
    public void augmenter(){

    }
    public void affiche(){
        System.out.println("le salaire de Monsieur " + this.nom + " est de :" + this.salaire);
    }
    public void calcsalaire(){

    }
}
