package org.javacream.groovy.application.books;

import org.javacream.groovy.application.books.Book;

import groovy.util.GroovyTestCase;

class BookTest extends GroovyTestCase {

//	void testBook(){
//		final String ISBN = "Isbn1"
//		final String TITLE = "Title1"
//		final int PAGES=200
//		final double PRICE=19.9
//		final boolean AVAILABLE= false
//		Book book = new Book(ISBN, TITLE, PAGES, PRICE, AVAILABLE)
//		println book.toString()
//	}
//	void testBook2(){
//		def ISBN = "Isbn1"
//		def TITLE = "Title1"
//		def PAGES=200
//		def PRICE=19.9
//		def AVAILABLE= false
//		def book = new Book(ISBN, TITLE, PAGES, PRICE, AVAILABLE)
//		println book.toString()
//	}

	void testBookChange(){
		final String ISBN = "Isbn1"
		final String TITLE = "Title1"
		final int PAGES=200
		final double PRICE=19.9
		final boolean AVAILABLE= false
		Book book = new Book(ISBN, TITLE, PAGES, PRICE, AVAILABLE)
		println book.toString()
		book.isbn = "Isbn3" //Java: book.setIsbn(isbn);
		println book.toString()
	}

	}
