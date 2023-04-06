package org.example.exoRecursive;

public class Exo {
    int i = 10;
    public int exo1(int a){

            System.out.println(a + " * ");

        if (a != 1 ){

            return  a * exo1(a-1);
        } else {
            return 1;
        }


    }
    public static int exo2(int a,int b){

        if (b == 0){
            return 0;
        } else {
            int sum = a*b;
            System.out.println(a+"*" +b+ "="+sum );
            return a + exo2(a,b-1);
        }
    }
    public  int test(int a){

        if (i == 0){
            return 0;
        } else {
            int sum = a*i;
            System.out.println(a+"*" +i+ "="+sum );
            i--;
            return a + test(a);
        }
    }
}
