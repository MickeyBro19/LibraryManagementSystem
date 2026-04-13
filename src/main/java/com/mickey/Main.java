package com.mickey;

import com.mickey.entities.Librarian;
import com.mickey.entities.Student;
import com.mickey.services.BookService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        BookService bookService = new BookService(); // 🔥 ONE INSTANCE

        Librarian librarian = new Librarian(bookService);
        Student student = new Student(bookService);

        librarian.addBook();
        librarian.addBook();
        librarian.addBook();
        librarian.getBooks();

        student.issueBook();

        librarian.getBooks();
        student.returnBook();

        librarian.getBooks();
    }
}
