package org.example.tpVendredi.exoTab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ExoTab {

    public static void Exo1(){
        int[] tab = {1,2,3,4,5};
        System.out.println(tab[2]);
    }

    public static void Exo2(){
        int[] tab ;
         tab = new int[10];
         for (int i = 0; i<tab.length; i++)
         {
             tab[i] = i+1;
         }
        System.out.println(Arrays.toString(tab));
    }


    public static void Exo3(){
        int[] tab ;
        tab = new int[8];
        boolean status = false;
        for (int i = 0; i<tab.length; i++)
        {

                tab[i] = (i+1)*10;


        }
        System.out.println("recherche un chiffre");
        Scanner sc = new Scanner(System.in);
        int tmp = sc.nextInt();
        for (int i = 0; i<tab.length; i++)
        {

           if (tmp == tab[i]){
               System.out.println(tmp +" est present");
                status = true;
               break;
           }


        }
        if (!status){
            System.out.println(tmp + " n'est pas present");
        }
        System.out.println(Arrays.toString(tab));

    }
    public static void Exo4(){
        int[] tab ;
        tab = new int[5];
        boolean status = false;
        for (int i = 0; i<tab.length; i++)
        {
            System.out.println("Donner le numero " + (i+1) +"/" + tab.length);
            Scanner sc = new Scanner(System.in);
            tab[i] = sc.nextInt();


        }


        for (int i = 0; i<tab.length; i++)
        {

            if (tab[i]%2 == 0){

                status = true;

            } else {
                status = false;
                break;
            }


        }
        if (status){
            System.out.println("tous les elments sont pairs");
            System.out.println(Arrays.toString(tab));
        } else {
            System.out.println("au moin un element n'est pas pair");
            System.out.println(Arrays.toString(tab));
        }



    }


}
