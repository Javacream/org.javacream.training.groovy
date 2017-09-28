package org.javacream.groovy.oop.static_types

class Book {

	String isbn
	String title
	double price
	int pages
	boolean available
	String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + ", pages=" + pages + ", available=" + available + "]"
	}
	
	Book(isbn, title, pages, price, available){
		this.isbn = isbn
		this.price = price
		this.pages=pages
		this.title=title
		this.available = available
	}
	
}


