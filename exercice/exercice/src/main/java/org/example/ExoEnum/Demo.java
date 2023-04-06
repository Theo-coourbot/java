package org.example.ExoEnum;

import java.util.Scanner;

public class Demo {
    public static void demo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("priority message:");
        System.out.println("a : high");
        System.out.println("b : medium");
        System.out.println("c : low");
        System.out.println("d : low");
        System.out.println("q : jme casse !!");
        String choix = sc.next().toLowerCase();


        switch (choix.substring(0,1)){
            case("a") : {
                System.out.println(Prio.HIGH.getPriority() + " has a priority " +Prio.HIGH);
                demo();
            }
            case("b") : {
                System.out.println(Prio.MEDIUM.getPriority() + " has a priority " +Prio.MEDIUM);
                demo();
            }
            case("c") : {
                System.out.println(Prio.LOW.getPriority() + " has a priority " +Prio.Low);
                demo();
            }
            case("d") : {
                System.out.println(Prio.Low.getPriority() + " has a priority " +Prio.Low);
                demo();
            } case ("q") :{
                System.out.println("bye");
                break;
            }
            default:{
                System.out.println(choix + " is not valid");
                demo();
            }
        }
    }
}
