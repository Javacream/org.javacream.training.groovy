package org.javacream.groovy.oop;

import org.javacream.groovy.oop.static_types.Book;

import groovy.util.GroovyTestCase;

class BookTest extends GroovyTestCase {

	void testBook(){
		def book = new Book('Isbn1', 'Title1', 200, 19.99, true)
		println book
		
	}
}
