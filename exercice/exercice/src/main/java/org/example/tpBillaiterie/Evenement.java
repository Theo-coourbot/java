package org.example.tpBillaiterie;

import java.util.Date;

public class Evenement {
    String nom;
    Date date;
    String heure;
    Lieu lieu;
    int prix;
    int nbrBilletVendu;

    public Evenement(String nom, Date date, String heure, Lieu lieu, int prix, int nbrBilletVendu) {
        this.nom = nom;
        this.date = date;
        this.heure = heure;
        this.lieu = lieu;
        this.prix = prix;
        this.nbrBilletVendu = nbrBilletVendu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public Lieu getLieu() {
        return lieu;
    }

    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getNbrBilletVendu() {
        return nbrBilletVendu;
    }

    public void setNbrBilletVendu(int nbrBilletVendu) {
        this.nbrBilletVendu = nbrBilletVendu;
    }

    public  void verifBillet () {
        int calcPlaceDipo = lieu.capacite-nbrBilletVendu;
        if ( calcPlaceDipo> 0){
            System.out.println("il reste " + calcPlaceDipo + " place");
        } else {
            System.out.println("plus de place disponible");
        }

    }


    @Override
    public String toString() {
        return "Evenement{" +
                "nom='" + nom + '\'' +
                ", date=" + date +
                ", heure='" + heure + '\'' +
                ", lieu=" + lieu +
                ", prix=" + prix +
                ", nbrBilletVendu=" + nbrBilletVendu +
                '}';
    }
}
