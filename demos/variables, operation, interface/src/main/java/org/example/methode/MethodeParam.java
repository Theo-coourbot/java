package org.example.methode;

public class MethodeParam {

    public static void changeValue(int i ) {
        i += 100 ;
    }

    public static  int changeInt(int i){

       i+=100;

        return i;
    }
    int valeur = changeInt(5);



    public  static void changeArray(int[] arrey, int val){
        arrey[1] = 100;
    }

    public int sum(int... ints){
        int sum = 0;
        for (int i : ints){
            sum += 1;
        }
        return sum;

    }

    public int[] intTab(){



        return null;
    }

    public int calc(int a,int b){

        if (b == 0){
            return 0;
        } else {

        return a + calc(a,b-1);
        }



    }



}

