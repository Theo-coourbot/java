package org.example.variable;

public class Variable {


    public static void getVar(){


        byte b = 127;
        short s;
        s=2;
        int i = 4;
        System.out.println("La valeur i vaut :" + i);

        i=b;

        System.out.println("La valeur i vaut :" + i);
//un charcatere
        char c = 'j';
        //un booleen
        boolean bool = true;
        int i2 = 350;
        //num a virgule
        float f = 1.44F;
        long l = 200000000000000000L ;
        double d = 1.5;

        d=f;
        l=i;
        d=i;

        byte bb = 1;
        //pour caster pas precis
        bb = (byte) i2;

        System.out.println("la valeur de bb est : " + bb);


        long number = 1_243_144_444_5255_555_44L;

    }
}
