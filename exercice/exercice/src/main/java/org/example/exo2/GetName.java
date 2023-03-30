package org.example.exo2;

import java.util.Scanner;

public class GetName {

    public static void Name(){
        String name;
        String firstname;


        System.out.println("donne ton nom");
        Scanner sc = new Scanner(System.in);
        name = sc.next() ;

        System.out.println("puis ton prenom");
        Scanner sc2 = new Scanner(System.in);
        firstname = sc2.next() ;
        System.out.println("Bonjour a toi " + name + " " + firstname);
    }
}
