package org.example.Poo.tpSalarie;

public class Salarie {
    public int matricule=0;
    public static int count = 0;
    public String categorie;
    public  String service;
    public  String nom;
    public int salaire;

    public Salarie(String nom, int salaire) {
        this.matricule = count;
        this.nom = nom;
        this.salaire = salaire;
    }
    {
        ++count;
    }
    public void calculerSalaire(){

    }

    public void afficherSalaire(){

        System.out.println("le salaire de " + this.nom + " est de " + this.salaire + " euros");
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    @Override
    public String toString() {
        return "Salaire{" +
                "matricule=" + matricule +
                ", count=" + count +
                ", categorie='" + categorie + '\'' +
                ", service='" + service + '\'' +
                ", nom='" + nom + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
