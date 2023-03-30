package org.example.exoDesTableau;
import java.lang.reflect.Array;
import java.util.Arrays;
import  java.util.Random;
import java.util.Scanner;

public class ExoTab {
    //5.10
    public static void Caisse(){
        int nbr = 1000000;
        int rendu10 = 0;
        int rendu5 =0;
        int rendu1=0;
        int somme = 0 ;

        while (nbr != 0 ){
            System.out.println("entrer vos article");

            Scanner sc = new  Scanner(System.in);
            nbr = sc.nextInt();
             somme +=  nbr ;

        }
        System.out.println("vous nous devez " + somme + " euros");
        Scanner sc2 = new  Scanner(System.in);
        int rendu = sc2.nextInt();
        int result = rendu - somme ;
        while (result >= 10){
            result =result - 10;
            rendu10 += 1;
        }
        while (result >= 5){
            result =result - 5;
            rendu5 += 1;
        }
        while (result > 0){
            result =result - 1;
            rendu1 += 1;
        }
        System.out.println("nous vous vous devons " + rendu10 + " billet de 10, " + rendu5 +" billet de 5 et " + rendu1 + " piece de 1euros" );
    }

    public static void getMoyenne(){
        int[] table;
        table = new int[21];
        int moy = 0;
        int noteMax = -2000000000;
        int noteMin = 2000000000;


        for (int i = 1; i <20; i++){

            System.out.println("entrer la " +i + " eme note");
            Scanner sc = new Scanner(System.in);
            int tmp = sc.nextInt();
    if (tmp<=20 && tmp >=0){
        table[i] = tmp;
    } else {
        System.out.println("entre 0 et 20 pls");
        i--;
    }





        }
        for (int i = 0 ; i<table.length; i++){
            System.out.println(table[i]);
             moy += table[i];
             if (noteMax < table[i]){
                 noteMax = table[i];
             }
            if (noteMin > table[i]){
                noteMin = table[i];
            }

        }
        System.out.println("la moyenne est de " + moy/ table.length);
        System.out.println("la meilleur note est de " + noteMax);
        System.out.println("la pire note est de " + noteMin + " ps : tu est nul");

    }

    public static void TabDecalage(){
        char[] tabChar = {'X','L','R','O','Z'};
        char[] tabCharDecale;
        tabCharDecale = new char[5];

        for (int i = 0 ; i<tabChar.length; i++){



            if (i+1 < tabChar.length){
                //System.out.println(tabChar[i+1]);
                tabCharDecale[i] = tabChar[i+1];
            } else {
                tabCharDecale[i] = tabChar[0];
                //System.out.println("fin");
            }
            System.out.println(tabCharDecale[i]);

        }


    }git r(){
        System.out.println("donne un nombre pour genere un tbleau de cette taille");
        Scanner sc = new Scanner(System.in);
       int tmp = sc.nextInt();
        generateRandomArray(tmp);
    }
    public static int [] generateRandomArray(int nbr){
        int[] table;
        table = new int[nbr];
        int nbrRandom = 0;
        Random random = new Random();

        for (int i=0; i<table.length;i++){
          nbrRandom = random.nextInt(100);
            table[i] = nbrRandom;
        }
            System.out.println("Tableau 1 : " +Arrays.toString(table));

        int j = 0;
        int[] table2;
        table2 = new int[table.length *2];
        for (int i=0; i<table2.length;i++){

            if ( i < table.length){
                table2[i] = table[i];
            } else {

                table2[i] = table[j]*2;
                j ++;
            }
        }

        System.out.println("Tableau 2 : " +Arrays.toString(table2));

       return table;

    }




}
