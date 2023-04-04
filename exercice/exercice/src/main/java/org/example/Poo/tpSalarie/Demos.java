package org.example.Poo.tpSalarie;



public class Demos {

    public static void main  (){
            int salairetotaux = 0;
        Salarie salarie = new Salarie("Theo",2000);
        Salarie salarie2 = new Salarie("Thea",1900);
        Salarie salarie3 = new Salarie("Theou",1500);
        Salarie salarie4 = new Salarie("Thei",1400);
        Salarie salarie5 = new Salarie("Teo",2200);

        System.out.println("nombre de salariés : " + Salarie.count);
        salarie.afficherSalaire();
        salarie2.afficherSalaire();
        salarie3.afficherSalaire();
        salarie4.afficherSalaire();
        salarie5.afficherSalaire();

        int[] tab = {salarie.salaire, salarie2.salaire, salarie3.salaire, salarie4.salaire, salarie5.salaire};
        //System.out.println(salaire);
        for (int i=0; i< tab.length;i++){
            salairetotaux+= tab[i];
        }
        System.out.println("le salaire total est de " + salairetotaux + " euros");
        salarie.setMatricule(1);
        System.out.println("nombre de salariés : "+ salarie.getMatricule());
    }
}
