package com.sd.streams;

import java.util.Comparator;
import java.util.List;

public class HighestRatedBook {

	public static void main(String[] args) {
		Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, 4.3);
		Book book2 = new Book("1984", "George Orwell", 1949, 4.5);
		Book book3 = new Book("Pride and Prejudice", "Jane Austen", 1813, 4.7);

        List<Book> books = List.of(book1,book2,book3);
        String response = findHighestRatedBook(books);
        System.out.println("respons "+response);
        
	}
	
	public static String findHighestRatedBook(List<Book> books) {
	    return books.stream()
	                .max(Comparator.comparingDouble(Book::getRating))
	                .get()
	                .getTitle();
	    
	}


}

class Book {
	
    public Book(String title, String author, int publicationYear, double rating) {
		super();
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
		this.rating = rating;
	}
	private String title;
    private String author;
    private int publicationYear;
    private double rating;
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
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}

    // Constructor, getters, and setters
}

