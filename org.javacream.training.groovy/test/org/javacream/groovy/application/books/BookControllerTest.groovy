package org.javacream.groovy.application.books;

import org.javacream.groovy.application.books.BookController;

import groovy.util.GroovyTestCase;

class BookControllerTest extends GroovyTestCase {


	void testBookControllerBasic(){
		BookController controller = new BookController()
		def isbn = controller.insertBook 'title', 200, 19.99;
		assertNotNull isbn
		def book = controller.findBookByIsbn(isbn);
		assertNotNull book
		book.price = 29.99
		book.keywords.add 'history'
		controller.updateBook book
		println controller.getKeywords()
		controller.deleteBookByIsbn isbn
		book = controller.findBookByIsbn(isbn);
		assertNull book
		def priceRange = 5.0..9.99
		println controller.findBooksByPriceRange(priceRange)
		println controller.getAvailableIsbns()

		Calendar calendar = Calendar.instance
		calendar.set 2012, 1, 3

		Date startDate = calendar.time
		calendar.set 2012, 1, 7
		Date endDate = calendar.time

		def dateRange = startDate..endDate
		println controller.findBooksByPublishingDate(dateRange)

		println controller.getKeywords()
	}
	void _testBookControllerFile(){
		BookController controller = new BookController()
		controller.load 'c:/_training_groovy/data/book1.txt'
		def book = controller.findBookByIsbn('FileIsbn')
		assertNotNull book
		controller.dump 'c:/_training_groovy/data/books.txt'
	}
	void _testBookControllerSlurp(){
		BookController controller = new BookController()
		controller.slurp()
		def book = controller.findBookByIsbn('SlurperIsbn')
		assertNotNull book
		println book.title
		println controller.getKeywords()
	}
}
