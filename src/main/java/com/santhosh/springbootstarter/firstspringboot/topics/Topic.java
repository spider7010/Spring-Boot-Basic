package com.santhosh.springbootstarter.firstspringboot.topics;

public class Topic {

    private int id;
    private String name;
    private String ISBN;

    public Topic() {
        super();
    }

    public Topic(int id, String name, String ISBN) {
        this.id = id;
        this.name = name;
        this.ISBN = ISBN;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
