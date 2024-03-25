package org.example;

import org.example.entity.Book;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        Serialiser ser = new Serialiser();

        Book book = Book.createBook("Sam Newman","ISBN-1234","mICROSERVICES");
        ser.serializeBook(book);
        ser.deSerializePerson("book.ser");
    }
}