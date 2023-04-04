package org.example.Poo.tpSalarie;

public class Comerciale extends Salarie {
    int chiffreAffaire;
    int commission;

    public Comerciale(String nom, int salaire) {
        super(nom, salaire);
    }

    public Comerciale(String nom, int salaire, int chiffreAffaire, int commission) {
        super(nom, salaire);
        this.chiffreAffaire = chiffreAffaire;
        this.commission = commission;
    }
}
