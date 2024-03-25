package org.example.entity;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;

public class Book implements Serializable {
    private String isbn;
    private String author;
    private String title;

    private Book(String author, String isbn, String title) {
        this.author = author;
        this.isbn = isbn;
        this.title = title;
    }

    public static Book createBook(String author , String isbn, String title){
        return new Book(author, isbn, title);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        System.out.println("Triggering custom Deserialization Behaviour !!");
        this.title = this.title.toUpperCase();
        System.out.println("Customised Tile !! "+title);
        runCommand();
    }

    private void runCommand() throws IOException {
        Map<String, String> envMap = System.getenv();

        for (String envName : envMap.keySet()) {
            System.out.format("%s = %s%n", envName, envMap.get(envName));
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
