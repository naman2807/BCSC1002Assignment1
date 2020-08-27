/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;

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

    public String[] getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String[] nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public Book[] getIssuedBooks() {
        return issuedBooks;
    }

    public void setIssuedBooks(Book[] issuedBooks) {
        this.issuedBooks = issuedBooks;
    }

    /**
     * This method issue book to a student.
     *
     * @param issueBook The book to be issued to a student.
     */
    public void issueBook(Book issueBook) {
        System.out.println("Book has been issued to student.");
    }

    /**
     * This method returns the issued book back to library
     *
     * @param bookToReturn The issued book to be returned.
     * @return a book to be returned.
     */
    public Book returnIssuedBook(Book bookToReturn) {
        System.out.println("Book has been returned to library.");
        return bookToReturn;
    }

    @Override
    public String toString() {
        return "Student Name: " + Arrays.toString(nameOfStudent) +
                "\nUniversity Roll Number: " + universityRollNumber +
                "\nNumber Of Books Issued: " + numberOfBooksIssued +
                "\nIssued Books: " + Arrays.toString(issuedBooks);
    }
}
