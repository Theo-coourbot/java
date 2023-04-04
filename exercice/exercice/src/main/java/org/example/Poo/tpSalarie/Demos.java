package org.example.Poo.tpSalarie;



public class Demos {

    public static void main  (){
            int salairetotaux = 0;
        Salaire salaire = new Salaire("Theo",2000);
        Salaire salaire2 = new Salaire("Thea",1900);
        Salaire salaire3 = new Salaire("Theou",1500);
        Salaire salaire4 = new Salaire("Thei",1400);
        Salaire salaire5 = new Salaire("Teo",2200);

        System.out.println("nombre de salariés : " + salaire.count);
        salaire.afficherSalaire();
        salaire2.afficherSalaire();
        salaire3.afficherSalaire();
        salaire4.afficherSalaire();
        salaire5.afficherSalaire();

        int[] tab = {salaire.salaire, salaire2.salaire, salaire3.salaire, salaire4.salaire, salaire5.salaire};
        //System.out.println(salaire);
        for (int i=0; i< tab.length;i++){
            salairetotaux+= tab[i];
        }
        System.out.println("le salaire total est de " + salairetotaux + " euros");
        salaire.setMatricule(1);
        System.out.println("nombre de salariés : "+ salaire.getMatricule());
    }
}
