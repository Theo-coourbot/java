package org.example.ManagementBook;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Book {
    int id;
    String name;
    List<Autor> autor;
    Publisher publishers;
    int PublishingAnnee;
    int AmountofPages;
    BigDecimal price;
    CoverType coverType;

    public Book(int id, String name, List<Autor> autor, Publisher publishers, int publishingAnnee, int amountofPages, BigDecimal price, CoverType coverType) {
        this.id = id;
        this.name = name;
        this.autor = autor;
        this.publishers = publishers;
        PublishingAnnee = publishingAnnee;
        AmountofPages = amountofPages;
        this.price = price;
        this.coverType = coverType;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", autor=" + autor +
                ", publishers=" + publishers +
                ", PublishingAnnee=" + PublishingAnnee +
                ", AmountofPages=" + AmountofPages +
                ", bigDecimal=" + price +
                ", coverType=" + coverType +
                '}';
    }
}
