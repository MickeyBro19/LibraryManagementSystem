package com.mickey.entities;

public class Book {
    private static int count=1;
    private int id;
    private String title;
    private boolean isIssued=false;

    public Book( String title) {
        this.id = count++;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + '}';
    }
}
