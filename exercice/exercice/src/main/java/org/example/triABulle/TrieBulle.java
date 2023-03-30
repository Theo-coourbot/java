package org.example.triABulle;

import java.util.Arrays;

public class TrieBulle {
    public static void trie(){
        int[] table = {70,20,30,45,8,2,95,10,0,6,99,42,6,74,10,20,5};

        int tmp = 0;
        System.out.println("tableau avant tri : " + Arrays.toString(table));
        for (int i =0 ; i <table.length;i++){

            for (int j =0 ; j <table.length-1;j++){
                if (table[j] > table[j+1]){

                    tmp = table[j];
                    table[j] = table[j+1];
                    table[j+1] = tmp;
                }
            }

        }

        System.out.println("tableau apres tri : " + Arrays.toString(table));

    }
    public static void trieSelection(){
        int[] table = {70,24,30,45,8,2,95,15,0,9,99,42,6,74,10,20,5};

        int count = 0;
        int tmp2 = 0;
        int tmp = 0;
        System.out.println("tableau avant tri : " + Arrays.toString(table));
        for (int i =0 ; i <table.length;i++){
         tmp = table[i];
            for (int j =0 ; j <table.length;j++){
                if (j == 0 ){
                    j = i ;
                }
                //System.out.println(table[i]);
                //System.out.println(table[j]);
                if (tmp > table[j]){
                   tmp2 = tmp;
                    tmp = table[j];
                    count = j;
                  //  table[j]=tmp2;
                }


            }
            table[i]=tmp;
            table[count]=tmp2;
            System.out.println(Arrays.toString(table));

        }

        System.out.println("tableau apres tri : " + Arrays.toString(table));

    }

}
