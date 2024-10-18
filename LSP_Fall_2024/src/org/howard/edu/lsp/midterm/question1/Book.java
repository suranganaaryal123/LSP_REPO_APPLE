package org.howard.edu.lsp.midterm.question1;

public class Book {
	//properties of the book
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    public Book(String title, String author, String ISBN, int yearPublished) {
    	//assigning values to the properties
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    // Overriding the equals() method to check if two Book objects are the same
    @Override
    public boolean equals(Object obj) {
    	//check if both objects are the same
        if (this == obj) return true;
     // Check if the object is null or if the class is different
        if (obj == null || getClass() != obj.getClass()) return false;

        Book book = (Book) obj;
     // Returning true only if both books have the same ISBN and author
        return ISBN.equals(book.ISBN) && author.equals(book.author);
    }

    // Override toString method
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}


