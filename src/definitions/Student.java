/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String[] nameOfStudent;
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] issuedBooks;

    public Student(String studentName, long universityRollNumber, int numberOfBooksIssued) {
        this.nameOfStudent = studentName.split(" ");
        this.universityRollNumber = universityRollNumber;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.issuedBooks = new Book[numberOfBooksIssued];
    }
}
