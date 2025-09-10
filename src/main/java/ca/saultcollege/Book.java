package ca.saultcollege;

public class Book {
    String title;
    String author;
    String ISBN;
    int pageCount;

    public Book(String title, String author, String ISBN, int pageCount) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Title: " + title + "                Author: " + author + "     Pages: " + pageCount +  " ISBN: " + ISBN;
    }
}
