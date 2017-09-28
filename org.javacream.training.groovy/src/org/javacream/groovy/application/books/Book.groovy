package org.javacream.groovy.application.books

class Book {


	String toString() {
		return "Book [isbn= $isbn , title=$title, pages=$pages, price=$price, available=$available, publishingDate=$publishingDate ]"
	}

	String isbn
	String title
	int pages
	double price
	boolean available	Date publishingDate;
	List keywords;

	Book(String isbn, String title, int pages, double price,
	boolean available) {
		this.isbn = isbn
		this.title = title
		this.pages = pages
		this.price = price
		this.available = available
		this.keywords=[]
	}
	void setIsbn(String isbn){
		println 'setting isbn...'
		this.isbn = isbn
	}	
}
