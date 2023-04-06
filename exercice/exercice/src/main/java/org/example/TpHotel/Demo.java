package org.example.TpHotel;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Demo {

        static Scanner sc = new Scanner(System.in);
        static Random r = new Random();
       static Hotel hotel = new Hotel();
    public  static void main(){
        int nbrchambre = 20;

        for (int i = 0 ;i<nbrchambre; i++){
            Chambre chambre = new Chambre(i,r.nextInt(1000),r.nextInt(10));
            hotel.numberChambre.add(chambre);


        }

        hotel.numberChambre.stream().forEach(System.out::println);
       menus();
    }
    public static  void menus(){

        System.out.println("===== Le Theotel =====");

        System.out.println("1- Ajout de client");
        System.out.println("2- afficher la  liste de client");
        System.out.println("3- afficher les réservations d'un client");
        System.out.println("4- Ajout de reservation");
        System.out.println("5- annuler une reservation");
        System.out.println("6- affichez la liste des resrvation");

        switch (sc.nextInt()){
            case (1) : {
                addClient();
                break;
            }
            case (2) : {
                afficheClient();
                break;
            } case (3) :{
                afficheReservation();
                break;
            } case (4) : {
                ajoutReservation();
                break;
            } case (5) : {
                break;
            } case (6) : {

                break;
            }
            default:{
                System.out.println("pas dans le menus");
                menus();
                break;
            }
        }


    }


    public static void addClient(){
        Scanner sc = new Scanner(System.in);

        System.out.println("votre prenom ?");
        String firsName = sc.nextLine();
        System.out.println("votre nom ?");
        String lastName = sc.nextLine();
        System.out.println("votre numéro de téléphone ?");
        String phone = sc.nextLine();

        Client newClient = new Client(lastName,firsName,phone);



        hotel.clients.add(newClient);
        System.out.println(firsName + " " + lastName + " ajout avec succes");

        menus();


    }
    public static void afficheClient(){


        if (hotel.clients.size() > 0){

        for (int i = 0; i<hotel.clients.size(); i++){
            System.out.println(" prenom : " +hotel.clients.get(i).prenom + " nom :  " + hotel.clients.get(i).nom + " phone :  " + hotel.clients.get(i).phone);
        }
        }else {
            System.out.println("il n'y a pas de client");
        }
        menus();
    }

    private static void afficheReservation() {
        if (hotel.clients.size() <= 0){
            System.out.println("il n'y a pas de client");
            menus();

        }else {
        System.out.println("votre telephone");
        Client client = null;
    sc.nextLine();
        String yourPhone = sc.nextLine();


                for (int  i = 0 ; i < hotel.clients.size(); i++){
//                    System.out.println(hotel.clients.get(i).phone);
//                    System.out.println("===");
//                    System.out.println(yourPhone);
                    if (hotel.clients.get(i).phone.contains(yourPhone)) {

                         client = hotel.clients.get(i);
                        break;
                    } else {
                        System.out.println("votre tlephone ne fait pas partis des clients enregistrez-vous");
                        menus();
                    }

                }

                System.out.println("client trouvé");
                    if (client.resevations.size() == 0){
                    System.out.println("aucune reservation a se numéro");
                } else {
                    for (int i =0; i< client.resevations.size(); i++ ){
                        System.out.println(client.resevations.get(i));
                    }
                }

                    menus();

        }
    }
    public static void ajoutReservation() {
        if (hotel.clients.size() <= 0) {
            System.out.println("il n'y a pas de client");
            menus();

        } else {
            System.out.println("votre telephone");
            String clientName = null;
            sc.nextLine();
            int idReservation = 0;
            String yourPhone = sc.nextLine();

            for (int  i = 0 ; i < hotel.clients.size(); i++){

                if (hotel.clients.get(i).phone.contains(yourPhone)) {

                  clientName = hotel.clients.get(i).nom;
                  for (int j=0; j < hotel.clients.get(i).resevations.size() ;j++){
                      idReservation = j;
                  }

                } else {
                    System.out.println("votre tlephone ne fait pas partis des clients enregistrez-vous");
                    menus();
                }


            }
        }
    }

}
