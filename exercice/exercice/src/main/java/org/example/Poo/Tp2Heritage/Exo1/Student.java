package org.example.Poo.Tp2Heritage.Exo1;

public class Student extends Person {


    public void goToClass(){
        System.out.println("En classe !!!");
    }

    public void DisplayAge(){
        System.out.println("mon age est de " + super.age + "ans");
    }

}
