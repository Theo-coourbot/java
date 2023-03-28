package org.example.exo4conditionPositifNegatif;

import java.util.Scanner;

public class NumberPosOrNeg {

    public static void getNumber(){
        int number;



        System.out.println("donne ton nombre");
        Scanner sc = new Scanner(System.in);


        number = sc.nextInt() ;
        if (number > 0) {
            System.out.println(number + " est positif");
        } else {
            System.out.println(number + " est negatif");
        }



    }
}
