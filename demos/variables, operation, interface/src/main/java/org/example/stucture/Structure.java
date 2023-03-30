package org.example.stucture;

public class Structure {
    static int  montant = 100;
    static int montant2 = 200;


    public static void getIfElse(){
        if (montant > montant2){
            System.out.println("le montant est sup a montant2");
        }else {
            System.out.println("le montant2 est sup a montant");
        }
    }

    public static void getIfElseIfElse(){

        if (montant > montant2){
            System.out.println("le montant est sup a montant2");
        } else if (montant == montant2) {
            System.out.println("le montant est egal montant2");
        } else {
            System.out.println("le montant2 est sup a montant");
        }
    }

    public static void getSwitch(){
        String valeur = "tata";

        switch (valeur){
            case "titi" :
                System.out.println("c'est titi");
                break;
            case "tata" :
                System.out.println("c'est tata");
                break;
            case "tutu" :
                System.out.println("c'est tutu");
                break;
            default:
                System.out.println("c'est tetu");
                break;
        }
    }
    public static void getFor(){
        int[] tab = {1,5,6,4,7,9};
        int sum = 0;
        for (int i = 0;i<4;i++){
            System.out.println("i = " + i);
        }
        for (int i = 0,j=10 ;i<j;i++, j--){
            System.out.println("i = " + i + " et j = " + j);
        }


        for (int number:tab){
            sum+=number;
            System.out.println("num egal : " + number);

        }
            System.out.println("somme egal : " + sum);
    }

    public  static void getBrakAndContinue(){

        System.out.println("----continue-----");
        for (int i=0; i < 5; i++){
            if(i % 2 == 0){
                System.out.println("je suis dans le if " + i);

                continue;
            }
            System.out.println("counter :" + i);
        }
    }
}
