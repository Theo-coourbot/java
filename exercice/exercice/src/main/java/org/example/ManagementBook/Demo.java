package org.example.ManagementBook;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(){
        Book[] books = new Book[]{



                new Book(1,"blanche et les sept dalmatiens",new Autor[]{new Autor(1,"super","super")},new Publisher(1,"Marvel"),1990,260,BigDecimal.valueOf(24.99),CoverType.Broche),
                new Book(2,"superman vs Jammy",new Autor[]{new Autor(1,"super","man"), new Autor(2,"jammy","sorcier")},new Publisher(2,"Disney"),2000,101,BigDecimal.valueOf(101),CoverType.Broche),
                new Book(3,"matrique",new Autor[]{new Autor(3,"Lana","Wachowski")},new Publisher(1,"Marvel"),1997,500,BigDecimal.valueOf(10.10),CoverType.Relie),
                new Book(4,"kluh",new Autor[]{new Autor(4,"geant","vert")},new Publisher(3,"Mais"),1992,350,BigDecimal.valueOf(34.90),CoverType.Relie)


        };

//        Book book1 = new Book(1,"blanche et les sept dalmatiens",new Autor[]{new Autor(1,"super","super")},new Publisher(1,"Marvel"),1990,260,BigDecimal.valueOf(24.99),CoverType.Broche);
//        Book book2 =          new Book(2,"superman vs Jammy",new Autor[]{new Autor(1,"super","man"), new Autor(2,"jammy","sorcier")},new Publisher(2,"Disney"),2000,101,BigDecimal.valueOf(101),CoverType.Broche);
//        Book book3 =          new Book(3,"matrique",new Autor[]{new Autor(3,"Lana","Wachowski")},new Publisher(1,"Marvel"),1997,500,BigDecimal.valueOf(10.10),CoverType.Relie);
//        Book book4 = new Book(4,"kluh",new Autor[]{new Autor(4,"geant","vert")},new Publisher(3,"Mais"),1992,350,BigDecimal.valueOf(34.90),CoverType.Relie);
//
//        List<Book> tab = new ArrayList<>( Arrays.asList(book1,book2,book3,book4));
        BookService bookService = new BookService();

        bookService.filterBooksByAuthor(new Autor(3,"Lana","Wachowski"),books);
        System.out.println("suite");
        bookService.filterBooksByAuthor(new Autor(1,"super","man"),books);
        System.out.println("autre test");
        bookService.filterBooksByPublisher(new Publisher(1,"Marvel"),books);
        System.out.println("suite annee");
        bookService.filterBooksByYear(1995,books);


    }
}
