package org.example.TpExeption;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exo {



    public static  void lancement() {
            int somme = 0;
        Scanner sc = new Scanner(System.in);
            int[] tab = new int[5];

            try{
                try {


       for (int i =0;i< tab.length;i++){
           try {
              System.out.println("nombre numero " + i);
              tab[i]=sc.nextInt();
              somme+=tab[i];
          } catch (ArithmeticException | InputMismatchException e){
              e.printStackTrace();
               System.out.println("a l'index " + i + " le numéro donné  n'est pas corect" );
               Exo.lancement();
          }
      }
       if (somme == 0){
           throw new Exception();
       }


                System.out.println(Arrays.toString(tab));
    System.out.println("la somme du tableau est de : " + somme);
   // System.out.println(tab[20]);


                }catch (Exception e){
                    System.out.println("le tab est vide");
                }


            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Le tableau est trop grand");
            }
    }
}
