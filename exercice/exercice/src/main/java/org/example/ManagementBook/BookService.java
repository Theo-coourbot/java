package org.example.ManagementBook;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BookService  {




    public List<Book> filterBooksByAuthor(Autor autor, List<Book> book ){
        List<Book> retour = new ArrayList<>(Arrays.asList());
        for (int i = 0 ; i < book.size(); i++){
            for (int j = 0; j<book.get(i).autor.size();j++){
                if (book.get(i).autor.get(j).firsName.contains(autor.firsName)){
                    retour.add(book.get(i));
                    System.out.println(book.get(i));
                }

            }

        }

        return retour;
    }

//    public List<Book> filterBooksByAuthorStream(Autor autor, List<Book> book ){
//        System.out.println("version stream");
//        List<Book> retour =
//
//
//        return retour;
//    }

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

    public List<Book> filterBooksByYearStream(int year,Book[] book ){
        System.out.println("version stream");
        List<Book> retour = Arrays.stream(book).filter(f->f.PublishingAnnee < year).collect(Collectors.toList());
        System.out.println(retour);

        return retour;
    }
}
