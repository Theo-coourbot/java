package org.example.Poo.TPHeritage;

public class Payant extends Compte {


    public Payant( float solde) {
        super( solde);
    }
    public void retrait(int valeur) {

        super.retrait(valeur);
        super.retraitTaux();

    }
    public void versement(int valeur){
        super.versement(valeur);
        super.retraitTaux();
    }
}
