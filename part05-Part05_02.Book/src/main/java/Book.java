/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jason
 */
public class Book {

    private String title;
    private String author;
    private int pageCount;

    public Book(String author, String name, int pages) {
        this.title = name;
        this.author = author;
        this.pageCount = pages;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.title;
    }

    public int getPages() {
        return this.pageCount;
    }

    @Override
    public String toString() {
        return this.author + ", " + this.title + ", " + this.pageCount + " pages";
    }
}
