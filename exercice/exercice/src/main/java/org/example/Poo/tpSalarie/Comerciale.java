package org.example.Poo.tpSalarie;

public class Comerciale extends Salarie {
    int chiffreAffaire;
    int commission;
    int trajet = 0;

    public Comerciale(String nom, int salaire) {
        super(nom, salaire);
    }

    public Comerciale(String nom, int salaire, int chiffreAffaire, int commission) {
        super(nom, salaire);
        this.chiffreAffaire = chiffreAffaire;
        this.commission = commission;
    }

    public int getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(int chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public void  seDeplacer(){
        this.trajet += 1000;
    }

    @Override
    public void calculerSalaire() {
        super.salaire = (super.salaire*commission /100)+super.salaire;
    }
}
