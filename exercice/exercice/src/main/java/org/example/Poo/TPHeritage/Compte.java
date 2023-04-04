package org.example.Poo.TPHeritage;

public class Compte {
     int count = 0;
    int code = 0;
     float solde=0;


    public Compte( float solde) {
        this.code = ++count;
        this.solde = solde;


    }
    public void retraitTaux(){
        this.solde = ((5/100)*this.solde)-this.solde;
    }
    public void versement(int valeur){
        this.solde += valeur;

    }
    public void retrait(int valeur){
        if (valeur > solde){
            System.out.println("pas asser d'argent sur le compte");
        }
        else {
            this.solde -= valeur;
        }

    }

    @Override
    public String toString() {
        return "Simple{" +
                "code=" + code +
                ", solde=" + solde +
                '}';
    }
}
