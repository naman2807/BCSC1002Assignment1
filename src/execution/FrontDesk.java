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

public class FrontDesk {
    private static final int ISSUE_BOOK_TO_STUDENT = 1;
    private static final int RETURN_ISSUED_BOOK = 2;
    private static final int SHOW_ISSUED_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Book maths = new Book("Maths", "RD Sharma", "MT4561");
        Book physics = new Book("Physics", "S Chand", "PH7546");
        Book chemistry = new Book("Chemistry", "RS Mishra", "CH1234");
        Book biology = new Book("Biology", "Deepam Mishra", "BI1597");

        Library library = new Library();

        Student naman = new Student("Naman Agarwal", 191500469, 5);


    }
}
