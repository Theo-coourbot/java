package org.example.TpHotel;

public class Chambre {

    int numero;
    Boolean status;
    int tarif;
    int capacite;

    public Chambre(int numero , int tarif, int capacite) {
        this.numero = numero;
        this.status = true;
        this.tarif = tarif;
        this.capacite = capacite;
    }

    public  void changeStatus(){
        this.status = !this.status;
    }


    @Override
    public String toString() {
        return "Chambre{" +
                "numero=" + numero +
                ", status=" + status +
                ", tarif=" + tarif +
                ", capacite=" + capacite +
                '}';
    }
}
