package org.example.exo1;

import java.util.Scanner;

public class NombreCarre {


    public static void getNumber(){
        int number;


        System.out.println("donne un numero et obtient son carré");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt() ;
        System.out.println(number + " au carré egale " + number*number);
    }
}
