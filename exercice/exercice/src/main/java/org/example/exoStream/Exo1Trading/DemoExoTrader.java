package org.example.exoStream.Exo1Trading;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoExoTrader {
    public static void demo(){

    Trader theo = new Trader("theo","France");
    Trader jean = new Trader("jean","Belgique");
    Trader john = new Trader("john","France");
    Trader remi = new Trader("remi","France");



    List<Transaction> transactions = Arrays.asList(new Transaction(theo,2011,800),new Transaction(theo,2010,300),new Transaction(jean,2012,1000)
    ,new Transaction(jean,2011,400),new Transaction(john,2012,700),new Transaction(remi,2012,950)
    ,new Transaction(remi,2022,900));

        System.out.println("1.");

        List<Transaction> transactionFiltre = transactions.stream().filter(f->f.getYear() == 2011).collect(Collectors.toList());
        transactionFiltre = transactionFiltre.stream().sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());


        System.out.println(transactionFiltre);


        System.out.println("2.");

        List<String> listeCity = transactions.stream().map(e->e.getTrader().getCity()).distinct().collect(Collectors.toList());
        System.out.println(listeCity);

        System.out.println("3.");

        List<String> listName = transactions.stream().map(e->e.getTrader().getName()).distinct().collect(Collectors.toList());
        listName= listName.stream().sorted().collect(Collectors.toList());
        System.out.println(listName);

        System.out.println("4.");

        boolean isOk = transactions.stream().anyMatch(f -> f.getTrader().getCity().contains("Belgique"));
        System.out.println(isOk);

        System.out.println("5.");

        OptionalInt maxValue = transactions.stream().mapToInt(Transaction::getValue).max();
        System.out.println(maxValue);

        System.out.println("6.");
        List<Trader> frenchTraders = transactions.stream().map(m->m.getTrader()).filter(f->f.getCity()=="France").distinct().collect(Collectors.toList());
        System.out.println(frenchTraders);

        System.out.println("7.");
        List<Integer> listeValeur = transactions.stream().filter(f->f.getTrader().getCity()=="France").map(m->m.getValue()).collect(Collectors.toList());
        System.out.println(listeValeur);

        System.out.println("8.");
        OptionalInt minValue = transactions.stream().mapToInt(Transaction::getValue).min();
        System.out.println(minValue);

    };





}
