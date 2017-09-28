package org.javacream.groovy.application.books;

import org.javacream.groovy.application.books.Book;

import groovy.util.GroovyTestCase;

class BookScratchTest extends GroovyTestCase {

	void testList(){
		def books = [];
		(1..<10).each {
			//def book = new Book(isbn: "Isbn$it", title: "Title$it", pages: 42, price: 19.99, available: false)
			def book = new Book("Isbn$it", "Title$it", it, 1.99*it, false)
			books.add book
			book.keywords = ['politics', 'sports']
			Calendar calendar = Calendar.instance
			calendar.set(2012, 1, it);
			book.publishingDate = calendar.time
		}
		books.each { return it}
	}
}
