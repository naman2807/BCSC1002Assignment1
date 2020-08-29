/*  Created by IntelliJ IDEA.
 *  User: Naman Agarwal (naman2807)
 *  Date: 27/08/20
 *  Time: 11:58 pm
 *  File Name : Book.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String[] nameOfStudent;
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] issuedBooks;

    public Student(String studentName, long universityRollNumber) {
        this.nameOfStudent = studentName.split(" ");
        this.universityRollNumber = universityRollNumber;
        this.issuedBooks = new Book[10];
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
     * This method checks if the book is present in issued books record of student and returns the issued book back to library
     *
     * @param bookToReturn The issued book to be returned.
     * @return a book to be returned.
     */
    public Book returnIssuedBook(String bookToReturn) {
        return null;
    }

    @Override
    public String toString() {
        return "Student Name: " + Arrays.toString(nameOfStudent) +
                "\nUniversity Roll Number: " + universityRollNumber +
                "\nNumber Of Books Issued: " + numberOfBooksIssued +
                "\nIssued Books: " + Arrays.toString(issuedBooks);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return universityRollNumber == student.universityRollNumber &&
                numberOfBooksIssued == student.numberOfBooksIssued &&
                Arrays.equals(nameOfStudent, student.nameOfStudent) &&
                Arrays.equals(issuedBooks, student.issuedBooks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(universityRollNumber, numberOfBooksIssued);
        result = 31 * result + Arrays.hashCode(nameOfStudent);
        result = 31 * result + Arrays.hashCode(issuedBooks);
        return result;
    }
}
