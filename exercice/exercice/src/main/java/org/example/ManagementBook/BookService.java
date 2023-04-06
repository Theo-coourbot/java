package org.example.ManagementBook;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BookService  {




    public List<Book> filterBooksByAuthor(Autor autor, Book[] book ){
        List<Book> retour = new ArrayList<>(Arrays.asList());
        for (int i = 0 ; i < book.length; i++){
            for (int j = 0; j<book[i].autor.length;j++){
                if (book[i].autor[j].firsName.contains(autor.firsName)){
                    retour.add(book[i]);
                    System.out.println(book[i]);
                }

            }

        }

        return retour;
    }


    public List<Book> filterBooksByPublisher(Publisher publisher, Book[] book ){
        List<Book> retour = new ArrayList<>(Arrays.asList());
        for (int i = 0 ; i < book.length; i++){

                if (book[i].publishers.publisherName.contains(publisher.publisherName)){
                    retour.add(book[i]);
                    System.out.println(book[i]);


            }

        }
        return  retour;
    }

    public List<Book> filterBooksByYear(int year,Book[] book ){
        List<Book> retour = new ArrayList<>(Arrays.asList());
        for (int i = 0 ; i < book.length; i++){

            if (book[i].PublishingAnnee < year){
                retour.add(book[i]);
                System.out.println(book[i]);


            }

        }


        return retour;
    }
}
