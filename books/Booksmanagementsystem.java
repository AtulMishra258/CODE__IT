/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books;

/**
 *
 * @author Atul Mishra
 */
public class Booksmanagementsystem {
     public static void main(String[] args) {
        // Create book objects
        Book book1 = new Book();
        book1.createBook(101, "Java Programming", 99.99, "Atul", true);

        Book book2 = new Book();
        book2.createBook(102, "Python Programming", 89.99, "Ramesh", false);

        Book book3 = new Book();
        book3.createBook(103, "C Programming", 79.99, "Rahul", true);

        Book book4 = new Book();
        book4.createBook(104, "Data Structures and Algorithms", 109.99, "Deepak", true);

        Book book5 = new Book();
        book5.createBook(105, "Database Systems", 119.99, "Saurav", false);

        // Display all books
        System.out.println("All Books:");
        book1.displayBook();
        book2.displayBook();
        book3.displayBook();
        book4.displayBook();
        book5.displayBook();

        // Display book by name
        System.out.println("Book by Name:");
        book4.displayBookByName("Data Structures and Algorithms");

        // Borrow book
        System.out.println("Borrow Book:");
        book5.borrowBook("Database Systems");
        book5.displayBook();
    }
}
