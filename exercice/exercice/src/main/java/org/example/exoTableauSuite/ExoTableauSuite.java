package org.example.exoTableauSuite;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExoTableauSuite {


    public static  void  askNumber(){
        System.out.println("Taille de votre tableau");
        Scanner sc = new Scanner(System.in);
        int tmp = sc.nextInt();
       // generateRandomArray(tmp);
        //croissant(tmp);
        reverseTab(tmp);
    }
    public static int [] generateRandomArray(int nbr){
        int[] table;
        table = new int[nbr];
        int count = 0;


        for (int i=0; i<table.length;i++){
            int j = i+1;
            System.out.println("entier N°" + j + "/" + table.length);
            Scanner sc = new Scanner(System.in);
            table[i] = sc.nextInt();
        }
        System.out.println("quelle entier recherche tu ?");
        Scanner scSeach = new Scanner(System.in);
        int seach = scSeach.nextInt();

        for (int i=0; i<table.length;i++){
            if (seach == table[i]){
                count++;            }
        }
        System.out.println(seach + " est present "+ count + " fois dans votre tableau");
        return table;

    }

    public static int [] croissant(int nbr){
        int[] table;
        table = new int[nbr];
        boolean status = false;


        for (int i=0; i<table.length;i++){
            int j = i+1;
            System.out.println("entier N°" + j + "/" + table.length);
            Scanner sc = new Scanner(System.in);
            table[i] = sc.nextInt();
        }


        for (int i=0; i<table.length -1;i++){
            if (table[i] < table[i+1]){
                status = true;
                            } else {
                status = false;
                break;
            }
        }
        if (status){
            System.out.println("le tableau " + Arrays.toString(table) + " est croissant");
        } else {
            System.out.println("le tableau " + Arrays.toString(table) + " n'est pas croissant alors range le =>");
        }

        return table;

    }
    public static int [] reverseTab(int nbr){
        int[] table;
        int[] table2;
        table = new int[nbr];
        table2 = new int[nbr];

       int count = nbr-1;


        for (int i=0; i<table.length;i++){
            int j = i+1;
            System.out.println("entier N°" + j + "/" + table.length);
            Scanner sc = new Scanner(System.in);
            table[i] = sc.nextInt();
        }


        for (int i=0; i<table.length;i++){
           table2[i] = table[count];
           count --;
        }

        System.out.println("tableau 1 :" + Arrays.toString(table));
        System.out.println("tableau 2 :" + Arrays.toString(table2));
        return table;

    }
}
