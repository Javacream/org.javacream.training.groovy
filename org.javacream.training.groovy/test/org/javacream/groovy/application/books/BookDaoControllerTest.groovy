package org.javacream.groovy.application.books;

import org.javacream.groovy.application.books.BookDaoController;

import groovy.util.GroovyTestCase;

class BookDaoControllerTest extends GroovyTestCase {


	void testBookControllerBasic(){
		BookDaoController controller = new BookDaoController()
		def isbn = controller.insertBook 'title', 200, 19.99;
		assertNotNull isbn
		def book = controller.findBookByIsbn(isbn);
		assertNotNull book
		book.price = 29.99
		book.keywords.add 'history'
		controller.updateBook book
		controller.deleteBookByIsbn isbn
		book = controller.findBookByIsbn(isbn);
		assertNull book
	}
}
