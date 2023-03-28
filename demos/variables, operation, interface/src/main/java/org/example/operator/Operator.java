package org.example.operator;


import org.example.model.Maison;

import java.util.Arrays;
import java.util.Scanner;

public class Operator {



    public static void getOperator(){
        System.out.println("--------------- les operateur -------------------");
        int i = 10;
        int i2 = -10;
        int i3 = i++;
        int i4 = ++i;
        int i5 = --i;
        int i6 = i--;
        System.out.println("i vaut : " + i);
        System.out.println("i2 vaut : " + i2);
        System.out.println("i3 vaut : " + i3);
        System.out.println("i4 vaut : " + i4);
        System.out.println("i5 vaut : " + i5);
        System.out.println("i6 vaut : " + i6);

    }


    public static void  getExpressionType(){

        byte b =1;
        short s = 1;
        int i = 1 ;
        long l = 1L ;
        float f = 1.0F;
        double d = d = 1.0 ;
        char c = 1;

        int express1 = b + s ;
        int express2 = b + i + c ;
        long express3 = i + l;
        float express4 = l + f;
        double express5 = f + d;

        int t1 = 2000000000;
        int t2 = 1000000000;
        int t3 = t1 +t2;
        double t4 = t1+t2;




        System.out.println("t3 vaut :" + t3);
        System.out.println("t4 vaut : " + t4);



    }


    public  static  void  getOperatorAndComparaisonType(){


        int int1 = 124;
        int int2 = 124;



        System.out.println("int1 est il egale a inr2 " + (int1 == int2));
        System.out.println("65 est il egale a A " + (65 == 'A'));

        Integer i =128 ;
        Integer i2 =128 ;

        System.out.println("i1 est il egale a i2 " + (i == i2));

        Integer i3 =127 ;
        Integer i4 =127 ;

        System.out.println("i3 est il egale a i4 " + (i3 == i4));



        int[] arr1 = {1,2,2,3};
        int[] arr2 = {1,2,2,3};

        System.out.println("arr1 est il egale a arr2 " + (arr1 == arr2));
        System.out.println("Arrays.equals(arr1,arr2)" + (Arrays.equals(arr1,arr2)));

        arr1 = arr2 ;
        System.out.println("arr1 est il egale a arr2 " + (arr1 == arr2));

        Maison maison1 = new Maison( 12,"maison1");
        Maison maison2 = new Maison( 12,"maison1");

        System.out.println("les maison egaux : " + (maison1 == maison2) );
        System.out.println("les maison.nom egaux : " + (maison1.nom == maison2.nom) );
    }


    public static void demoSysteme(){

        String nom;

        System.out.println("qui je suis ? ");
        Scanner sc = new Scanner(System.in);
        nom = sc.next();
        System.out.println("Mon nom " + nom);

    }
}
