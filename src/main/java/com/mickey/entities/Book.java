package com.mickey.entities;

public class Book {
    private static int count=1;
    private int id;
    private String title;
    private boolean isIssued;
    private int issuedToStudentId;

    public Book(String title) {
        this.id = count++;
        this.title = title;
        this.isIssued=false;
        this.issuedToStudentId=-1;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    public int getIssuedToStudentId() {
        return issuedToStudentId;
    }

    public void setIssuedToStudentId(int issuedToStudentId) {
        this.issuedToStudentId = issuedToStudentId;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", isIssued=" + isIssued + '}';
    }
}
