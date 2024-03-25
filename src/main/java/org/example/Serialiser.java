package org.example;

import org.example.entity.Book;
import org.example.entity.Person;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialiser {

    public void serializeBook(Book book) throws IOException {
        try(FileOutputStream fos = new FileOutputStream("book.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(book);
        }

    }

    public void serializePerson(Person person) throws IOException {
        try(FileOutputStream fos = new FileOutputStream("person.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(person);
        }

    }

    public Person deSerializePerson(String fileName) throws IOException, ClassNotFoundException {
        try(FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis)){
            return (Person) ois.readObject();
        }
    }
}
