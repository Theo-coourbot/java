package org.example.tpCollections;

import java.util.*;

public class Exo {

       static List<String> motListe = new ArrayList<>(Arrays.asList("arnaud","helice","harry","zebre","amende","lit","jouet"));
    public static void exo1() {
        List<Integer> tab = new ArrayList<>(Arrays.asList(1,-2, 5, 4, 8, 9, 6, 4, 15, 0, 20, 36, 99));

        // solution 1 trie croissant
                  int tmp = 0;
        for (int i = 0;i<tab.size();i++){
            for (int j =0;j < tab.size();j++){

            if (j+1 < tab.size()){
              if(  tab.get(j) > tab.get(j+1)){
                  tmp = tab.get(j);

                  tab.set(j,tab.get(j+1));
                  tab.set(j+1,tmp);
              };
            }else {
                break;
            }
            }


        }
       System.out.println(tab.toString());



//        solution 2
//        Collections.sort(tab);





//        solution 1 inverse
//        Collections.sort(tab, Collections.reverseOrder());
//        System.out.println(tab.toString());


        //solution 2 reverse
        for (int i = 0;i<tab.size();i++){
            for (int j =0;j < tab.size();j++){

                if (j+1 < tab.size()){
                    if(  tab.get(j) < tab.get(j+1)){
                        tmp = tab.get(j);

                        tab.set(j,tab.get(j+1));
                        tab.set(j+1,tmp);
                    };
                }else {
                    break;
                }
            }


        }
        System.out.println(tab.toString());


        //solution 1 tri pair

//    for (int i = 0; i<tab.size(); i++ ){
//        if (tab.get(i) % 2 ==1){
//            tab.remove(i);
//        }
//        }

    //solution 2 tri pair
        tab.removeIf(integer -> integer % 2 == 1);
        System.out.println(tab.toString());



     //solution 1 pour remise a 0
    for (int i = 0; i<tab.size(); i++ ){
        if (tab.get(i) < 0 ){
            tab.set(i,0);

        }
    }
        System.out.println(tab.toString());
    }

    public static void actuMotListe (){
        Collections.sort(motListe);

    }
    public static void afficherMots(){
        actuMotListe();
        System.out.println(motListe);
    }
    public static void addMot(String nom){
        motListe.add(nom);
        actuMotListe();
    }


}






