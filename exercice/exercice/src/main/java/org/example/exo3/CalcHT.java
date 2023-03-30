package org.example.exo3;

import java.util.Scanner;

public class CalcHT {

    public static void Getprice(){
        float priceHT;
        int nuberArt;
        float TVA;


        System.out.println("donne le prix de l'article");


        Scanner getPriceHT = new Scanner(System.in);
        priceHT = getPriceHT.nextFloat();

        System.out.println("puis le nombre d'article");
        Scanner getNumberArt = new Scanner(System.in);
        nuberArt = getNumberArt.nextInt();

        System.out.println("et enfin la TVA");
        Scanner getTVA = new Scanner(System.in);

        TVA = getTVA.nextFloat();
        float calc = priceHT * nuberArt;

        float result =  calc * TVA;
        System.out.println("Le prix TTC sera de" + result);
    }
}
