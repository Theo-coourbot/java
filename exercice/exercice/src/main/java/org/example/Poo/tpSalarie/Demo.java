package org.example.Poo.tpSalarie;

import java.util.*;

public class Demo {
    public static void main() {
        int count = 5;
        int choix = -1;
        char c = 'c';
        char s = 's';
        int salairetotaux = 0;
        Salarie salarie = new Salarie("Theo",2000);
        Salarie salarie2 = new Salarie("Thea",1900);
        Salarie salarie3 = new Salarie("Theou",1500);
        Salarie comercial = new Salarie("Thei",1400);
        Salarie salarie4 = new Salarie("Teo",2200);


        List<Salarie> tab = new ArrayList<>(Arrays.asList(salarie,salarie2,salarie3,comercial,salarie4));

        while (choix != 0 ){
            System.out.println("========== Gestion Menus ==========");
            System.out.println("1-- Ajouter un employé");
            System.out.println("2-- afficher le salaire des employés");
            System.out.println("3-- recherche de salarié");
            System.out.println();
            Scanner sc = new Scanner(System.in);
            choix = sc.nextInt();
            switch (choix){
                case (0) : {
                    System.out.println("bye");
                    break;
                }
                case(1) : {

                    int choixAjout;
                    System.out.println("========== Ajout D'employe ==========");
                    System.out.println("1-- Ajouter un salarie");
                    System.out.println("2--  Ajouter un comerciale");
                    System.out.println("3--  retour");
                    Scanner sc2 = new Scanner(System.in);
                    choixAjout = sc2.nextInt();
                    switch (choixAjout){
                        case (1) : {

                            System.out.println("nom du salarié");
                            Scanner name = new Scanner(System.in);
                            String myname = name.nextLine();
                            System.out.println("salaire du salarié");
                            Scanner salaire = new Scanner(System.in);
                            int mySalaire = salaire.nextInt();
                            Salarie salarie5 = new Salarie(myname,mySalaire);
                            salarie5.afficherSalaire();
                            tab.add(salarie5);
                            break;

                        }
                        case (2) : {
                            System.out.println("nom du comerciale");
                            Scanner name = new Scanner(System.in);
                            System.out.println("salaire du comerciale");
                            Scanner salaire = new Scanner(System.in);
                            Salarie comercial2 = new Salarie(name.nextLine(),salaire.nextInt());
                            comercial2.afficherSalaire();
                            tab.add(comercial2);
                            break;

                        } case (3) : {

                            System.out.println("==retour==");
                            break;
                        }


                        default:{
                            System.out.println("le numéro n'est pas présent retour");
                        }

                    }


                    break;
                }case(2) : {

                    for (int i=0; i< tab.size();i++){
                        salairetotaux += tab.get(i).salaire;

                        tab.get(i).afficherSalaire();

                    }
                    System.out.println("le salaire total est de " + salairetotaux + " euros");
                    break;
                } case (3) : {
                    System.out.println("nom que tu cherche");
                    Scanner name = new Scanner(System.in);
                    String searchName = name.next();
                    for (int i=0; i< tab.size();i++){
                        System.out.println(searchName);
                        System.out.println(tab.get(i).nom);
                        if (searchName.contains(tab.get(i).nom)){

                            System.out.println(tab.get(i));
                            break;
                        }
                        else {
                            System.out.println("Cette employe n'existe pas");
                        }
                    }
                        break;
                }
                default:{
                    System.out.println("Le numéro n'est pas dans le menu");
                }
            }
        }



    }
}



