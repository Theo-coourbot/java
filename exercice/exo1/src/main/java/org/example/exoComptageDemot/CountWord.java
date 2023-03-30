package org.example.exoComptageDemot;

import java.util.Scanner;

public class CountWord {
    public static void getWord(){
        String name1;
        String[] table;

        System.out.println("Fais une phrase");
        Scanner sc = new Scanner(System.in);
        name1 = sc.nextLine() ;
        table = name1.split(" ");
        System.out.println("il y a " + table.length + " dans cette phrase");
    }

    public static void getOccurence(){
        String name;
        String[] table;

        System.out.println("Fais une phrase nous conterons le nombre de e");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine() ;
        table = name.split("e");
        System.out.println("il y a " + (table.length-1) + " fois la lettre e");
    }

    public static void getAnagramme(){
        String name;
        String name2;
        String[] table;
        boolean status = false;

        System.out.println("1er mots");
        Scanner sc = new Scanner(System.in);
        name = sc.next() ;
        System.out.println("2eme mots");
        Scanner sc2 = new Scanner(System.in);
        name2 = sc2.next();
        String[] tab1 = name.split("") ;
        String[] tab2 = name2.split("") ;

        if (tab1.length == tab2.length ){
            for (int i = 0 ; i< tab1.length ; i++){
                String s = tab2[i];
                String s2 = tab1[i];

                if (name.contains(s)){
                    if (name2.contains(s2)){
                        status = true;
                    } else {
                        status = false ;
                        System.out.println("se n'est pas un annagramme");
                        break;
                    }


                } else {
                    status = false ;
                    System.out.println("se n'est pas un annagramme");
                    break;
                }

            }

        }else {
            System.out.println("la taille des mots n'est pas la meme !!!!!!!!!");
        }
        if (status == true){
            System.out.println(name + " est bien un anagrame de " + name2);
        }


    }

    public static void getPalindrome(){
        String name;
        boolean status = false;
        String[] table;
        int count = 0 ;


        System.out.println("donne ton mot");
        Scanner sc = new Scanner(System.in);
        name = sc.next() ;

         table = name.split("");

         for (int i = 0 ; i < table.length; i++){
             count++ ;
           int j = table.length - count ;
             System.out.println(table[i]);
             System.out.println(table[j]);
             if(table[i].contains(table[j]) ){
                 status =true;
             } else {
                 status = false;
                 System.out.println("se n'est pas un palindrome");
                 break;
             }
         }
         if (status == true){
             System.out.println("s'est bien un palindrome");
         }





    }


}
