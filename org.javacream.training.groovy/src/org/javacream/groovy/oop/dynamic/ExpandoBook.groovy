package org.javacream.groovy.oop.dynamic

class ExpandoBook{
	def static createBook(isbn, title, pages, price){
		new Expando(isbn: isbn, title: title, pages:pages, price:price);
	}
}

