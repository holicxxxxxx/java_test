package com.holicxxx.demo2.library;

public class Book {
    int id;
    String name;
    String editor;
    int price;

    public Book() {
    }

    public Book(int id, String name, String editor, int price) {
        this.id = id;
        this.name = name;
        this.editor = editor;
        this.price = price;
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

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
