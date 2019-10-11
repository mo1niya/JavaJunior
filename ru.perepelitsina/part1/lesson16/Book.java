package ru.perepelitsina.part1.lesson16;

import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID = 1l;
    private String name;
    private String author;
    private int date;
    private String genre;

    public Book(String name, String author, int date, String genre) {
        this.name = name;
        this.author = author;
        this.date = date;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", date=" + date +
                ", genre='" + genre + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
