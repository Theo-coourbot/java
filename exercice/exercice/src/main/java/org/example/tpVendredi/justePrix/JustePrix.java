package org.example.tpVendredi.justePrix;

import java.util.Random;
import java.util.Scanner;

public class JustePrix {


   public static void price(){
       Random random = new Random();
      int nbrRandom = random.nextInt(1000);
    boolean status = false;

      for (int i = 7 ; i != 0 ; i--){
          System.out.println("Trouve le prix entre 0 et 1000 il te reste : " + i + " essai(s).");
          Scanner sc = new Scanner(System.in);
          int proposer = sc.nextInt();


          
          if (proposer < nbrRandom && i > 0){
              System.out.println("s'est plus =}");
          } else if (proposer > nbrRandom && i > 0) {
              System.out.println("s'est moin =}");
          } else {
              System.out.println("s'est gagne ouaiiiiiii");
              status = true;
              break;
          }

      }
      if (!status){
          System.out.println("tu as perdu RIP");
      }
   }
}
