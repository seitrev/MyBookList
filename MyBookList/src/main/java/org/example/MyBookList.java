package org.example;

public class MyBookList {
    public static void main(String[] args) {
        System.out.println("=== Welcome to MyBookList ===");
        Book book1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 1997);
        Book book2 = new Book("The Power of Habit", "Charles Duhigg", 2012);
        Book book3 = new Book("Atomic Habits", "James Clear", 2018);
        Book book4 = new Book("Java Programming", "John Doe", 2020);
        Book book5 = new Book("How to Survive a Garden Gnome Attack", "Chuck Sambuchino", 2010);

        System.out.println("\n=== Welcome to MyBookList!! ===");

        //listing all Available Books
        System.out.println("\n=== All Books Available in My List!! ===");
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
        book4.displayDetails();
        book5.displayDetails();

        //changing curr page of two books
        book1.changePage(50);
        book3.changePage(100);
        System.out.println("\n=== Updated Pages!! ===");
        book1.displayDetails();
        book3.displayDetails();

        //changing  curr page of fave book
        book5.changePage(29);
        System.out.println("\n=== Favorite Book Updated!! ===");
        book5.displayDetails();

        //update author
        book4.setAuthor("Jane Smith");
        System.out.println("\n=== Updated Author!! ===");
        book4.displayDetails();

        Book[] books = new Book[]{book1, book2, book3, book4, book5};
        System.out.println("\n=== Books That Are Published After 2010 ===");
        //looping and getting books that are produced after 2010
        for(Book b : books) {
            if (b.getYearPublished() > 2010) {
                System.out.println(b.getTitle());
            }
        }

    }
}