package org.example;

import org.example.entity.Book;
import org.example.entity.Person;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        Serialiser ser = new Serialiser();

        //Book book = Book.createBook("Sam Newman","ISBN-1234","Microservices");
        //ser.serializeBook(book);
        ser.deSerializePerson("rce.ser");




/*        Person person = new Person("John","Doe");
        ser.serializePerson(person);

        Person per = ser.deSerializePerson("person.ser");
        System.out.println("Person ==> "+per);*/

    }
}