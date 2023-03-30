package org.example.exo6croissant;

import java.util.Scanner;

public class order {
    public static void GetOrder(){
        String name1;
        String name2;
        String name3;


        System.out.println("1er nom");
        Scanner sc = new Scanner(System.in);
        name1 = sc.next() ;
        System.out.println("2eme nom");
        Scanner sc2 = new Scanner(System.in);
        name2 = sc2.next() ;
        System.out.println("3eme nom");
        Scanner sc3 = new Scanner(System.in);
        name3 = sc3.next() ;



        name1.compareTo(name2);
        name2.compareTo(name3);

    }
}
