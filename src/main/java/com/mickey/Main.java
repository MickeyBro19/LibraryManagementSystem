package com.mickey;

import com.mickey.entities.Librarian;
import com.mickey.entities.Student;
import com.mickey.services.BookService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        BookService bookService = new BookService(); // 🔥 ONE INSTANCE

        Librarian librarian = new Librarian(bookService);
        Student student = new Student(bookService);

        System.out.println("Welcome to the Java Library");
        while(true){
            System.out.println("1. Add Book");
            System.out.println("2. Get Book");
            System.out.println("3. Get All Books");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("Enter choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                {
                    System.out.println("Enter Book Name to add");
                    String bookName = sc.next();
                    librarian.addBook(bookName);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter Book Name to find");
                    String bookName = sc.next();
                    librarian.findBook(bookName);
                    break;
                }
                case 3:
                {
                    System.out.println("Get All Books");
                    librarian.getBooks();
                    break;
                }
                case 4:
                {
                    System.out.println("Enter Book Name to Issue Book");
                    String bookName = sc.next();
                    student.issueBook(bookName);
                    break;
                }
                case 5:
                {
                    System.out.println("Enter Book Title to return");
                    String title=sc.next();
                    student.returnBook(title);
                    break;
                }
                case 6:{
                    System.out.println("Exiting");
                    return;
                }
                default:{
                    System.out.println("Invalid choice");
                    break;
                }

            }
        }


    }
}
