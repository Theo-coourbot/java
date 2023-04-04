package org.example.Poo.TpEmploye4bis;

public class Technicien extends Employe{
    public int grade;

    public Technicien(String nom, int age, int salaire, int grade) {
        super(nom, age, salaire);
        this.grade = grade;
    }

    public  void prime() {

    }

    @Override
    public void calcsalaire() {
        if(this.grade == 1){
            super.affiche();
                super.salaire += 100;
            super.affiche();
        } else if(this.grade == 2){
            super.affiche();
            super.salaire += 200;
            super.affiche();
        } else if (this.grade == 3) {
            super.affiche();
            super.salaire += 300;
            super.affiche();
        }

    }
}
