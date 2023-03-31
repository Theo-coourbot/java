package org.example.tpVendredi.tableau2dimension;

public class ExoTab2D {

    public static void exo1(){
        int[][] tab = {{5,2,3,7,5},{2,1,5,7,9},{8,9,5,5,9},{3,6,8,9,0}};

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                //System.out.println(tab[i][j] + " ");
                System.out.println(tab[i][j+i]);
            }
            System.out.println();
        }
    }
}
