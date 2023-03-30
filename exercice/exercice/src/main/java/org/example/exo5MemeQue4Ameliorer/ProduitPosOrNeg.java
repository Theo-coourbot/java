package org.example.exo5MemeQue4Ameliorer;

import java.util.Scanner;

public class ProduitPosOrNeg {

    public static void GetProduit(){
        int number;
        int number2;
        System.out.println("donne 1 nombre");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt() ;
        System.out.println("donne le deuxieme nombre");
        Scanner sc2 = new Scanner(System.in);
        number2 = sc.nextInt() ;


        if (number + number2 > 0) {
            System.out.println("le resultat de : " +number + "+" + number2 + "est positif");
        } else {
            System.out.println("le resultat de : " +number + "+" + number2 + "est negatif");
        }

    }
}
