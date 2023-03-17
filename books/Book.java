/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books;

/**
 *
 * @author Atul Mishra
 */
public class Book {
     private int bookid;
    private String bookName;
    private double bookPrice;
    private String authorName;
    private static String libraryName = "MyLibrary";
    private boolean availability;
public void createBook(int id, String name, double price, String author, boolean available) {
         this.bookid = id;
        this.bookName = name;
        this.bookPrice = price;
        this.authorName = author;
        availability = available;
    }

    public void displayBook() {
        System.out.println("Book ID: " + bookid);
        System.out.println("Book Name: " + bookName);
        System.out.println("Book Price: " + bookPrice);
        System.out.println("Author Name: " + authorName);
        System.out.println("Library Name: " + libraryName);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
        System.out.println();
    }

    public void displayBookByName(String name) {
        if (bookName.equals(name)) {
            displayBook();
        } else {
            System.out.println("Book not found!");
        }
    }

    public void borrowBook(String name) {
        if (bookName.equals(name)) {
            if (availability) {
                availability = false;
                System.out.println("Book borrowed successfully!");
            } else {
                System.out.println("Book is not available for borrowing!");
            }
        } else {
            System.out.println("Book is not found!");
        }
    }
}
