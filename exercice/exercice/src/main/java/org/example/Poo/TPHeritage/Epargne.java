package org.example.Poo.TPHeritage;

public class Epargne extends Compte{
    private float interet;
    public Epargne( float solde) {
        super( solde);
    }
    public void retrait(int valeur) {

        super.retrait(valeur);


    }
    public void versement(int valeur){
        super.versement(valeur);

    }
    public void calinteret(){
        this.interet = ((1/100)*super.solde)+super.solde;
    }
}
