package org.javacream.groovy.oop.static_types

class BookDemo{

	String isbn
	String title
	double price
	int pages
	boolean available
	String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + ", pages=" + pages + ", available=" + available + "]"
	}
}


def book = new BookDemo(isbn: 'Isbn1', title: 'Title1', pages: 200, price: 19.99, available: true)
println book
