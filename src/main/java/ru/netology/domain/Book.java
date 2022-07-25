package ru.netology.domain;

public class Book extends Product {

    public String author;

    public Book(int id, int cost, String name, String author) {
        super(id, name, cost);
        this.author = author;
    }
    @Override
    public boolean matches(String query) {
        if (super.matches(query)) {
            return true;
        }
        if (author.contains(query)) {
            return true;
        }
        return false;
    }
}
