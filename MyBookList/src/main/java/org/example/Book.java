package org.example;

class Book {
    private String title;
    private String author;
    private int yearPublished;
    private int currentPage;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.currentPage = 0;
    }

    public void displayDetails() {
        System.out.println("Title: " + this.title + ", Author: " + this.author + ", Year: " + this.yearPublished + ", Current Page: " + this.currentPage);
    }

    public void changePage(int newPage) {
        this.currentPage = newPage;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYearPublished() {
        return this.yearPublished;
    }
}