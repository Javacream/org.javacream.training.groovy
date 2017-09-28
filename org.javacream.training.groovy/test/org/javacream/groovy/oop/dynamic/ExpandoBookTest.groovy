package org.javacream.groovy.oop.dynamic

import org.javacream.groovy.oop.dynamic.ExpandoBook;

import groovy.util.GroovyTestCase;

class ExpandoBookTest extends GroovyTestCase {
	void testExpandoBook(){
		def book1 = ExpandoBook.createBook("isbn1", "title1", 200, 19.99)
		def book2 = ExpandoBook.createBook("isbn2", "title2", 100, 5.99)

		assertTrue book1.isbn == "isbn1"
		book1.topic = "Science"
		assertTrue book1.topic == "Science"
		assertNull book2.topic

		book2.year = 8
		assertTrue book2.year == 8

		//def book
		def saveClosure ={
			println "saving book... " + delegate.title
		}
	
		book2.save = saveClosure 
		
		book1.save = book2.save
		//book = book2
		book2.save()
		//book = book1
		book1.save()
		
	}
	
	
	void _testClosure(){
		def closure = inner()
		closure.call()
	}
	
	def inner(){
		def localBookInInner = ExpandoBook.createBook("isbn", "title", 200, 19.99)
		def saveClosure ={
			println "saving book... " + localBookInInner
		}
//		localBookInInner.save = saveClosure
//		localBookInInner.save()

//		saveClosure.call()
		return saveClosure
	}
}