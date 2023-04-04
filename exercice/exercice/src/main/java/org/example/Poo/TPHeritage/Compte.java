package org.example.Poo.TPHeritage;

public class Compte {
     int code = 0;
     float solde=0;


    public Compte(int code, float solde) {
        this.code += 1;
        this.solde = solde;


    }
    public void retraitTaux(){
        this.solde = ((5/100)*this.solde)-this.solde;
    }
    public void versement(int valeur){
        this.solde += valeur;

    }
    public void retrait(int valeur){
        this.solde -= valeur;

    }

    @Override
    public String toString() {
        return "Simple{" +
                "code=" + code +
                ", solde=" + solde +
                '}';
    }
}
