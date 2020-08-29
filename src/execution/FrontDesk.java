/*  Created by IntelliJ IDEA.
 *  User: Naman Agarwal (naman2807)
 *  Date: 27/08/20
 *  Time: 11:58 pm
 *  File Name : Book.java
 * */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_BOOK_TO_STUDENT = 1;
    private static final int RETURN_ISSUED_BOOK = 2;
    private static final int SHOW_ISSUED_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentInput;
        Book maths = new Book("Maths", "RD Sharma", "MT4561");
        Book physics = new Book("Physics", "S Chand", "PH7546");
        Book chemistry = new Book("Chemistry", "RS Mishra", "CH1234");
        Book biology = new Book("Biology", "Deepam Mishra", "BI1597");

        Library library = new Library();
        library.addNewBookToLibrary(maths);
        library.addNewBookToLibrary(physics);
        library.addNewBookToLibrary(chemistry);
        library.addNewBookToLibrary(biology);

        Student naman = new Student("Naman Agarwal", 191500469);
        do {
            System.out.println(" -=-=--=-=-Welcome To The Front Desk-=-=--=-=-\n" +
                    "How may I help you today?\n" +
                    "1. Issue a new book for me.\n" +
                    "2. Return a previously issues book for me.\n" +
                    "3. Show me all my issues books.\n" +
                    "4. Exit.");
            System.out.println("Enter your choice: ");
            studentInput = scanner.nextInt();
            scanner.nextLine();
            switch (studentInput) {
                case ISSUE_BOOK_TO_STUDENT:
                    System.out.println("Please enter the book to be issued:");
                    String bookName = scanner.nextLine();
                    Book issueBook = library.issueBookFromLibrary(bookName);
                    if (issueBook != null) {
                        naman.issueBook(issueBook);
                    } else {
                        System.out.println("Cannot issue book.");
                    }
                    break;
                case RETURN_ISSUED_BOOK:
                    System.out.println("Please enter the name of the book to be returned: ");
                    String returnBookName = scanner.nextLine();
                    Book returnBook = naman.returnIssuedBook(returnBookName);
                    if (returnBook != null) {
                        library.addReturnedBookToLibrary(returnBook);
                    } else {
                        System.out.println("Cannot return book.");
                    }
                    break;
                case SHOW_ISSUED_BOOKS:
                    Book[] issuedBooks = naman.getIssuedBooks();
                    for (Book issuedBook : issuedBooks) {
                        System.out.println(issuedBook);
                    }
                    break;
                default:
                    System.out.println("WRONG OPTION.");
            }
        } while (studentInput != EXIT);
        scanner.close();
    }
}
