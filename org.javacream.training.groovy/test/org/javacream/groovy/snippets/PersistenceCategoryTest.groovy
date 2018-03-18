package org.javacream.groovy.snippets

import org.javacream.groovy.oop.static_types.Book


class PersistenceCategory {
	static def save(Book self) {
		println "saving $self"
	}
	static def delete(Book self) {
		println "deleting $self"
	}
}

Book book = new Book('Isbn', 'Title', 200, 19.99, true);
use (PersistenceCategory.class) {
	book.save()
	book.delete()
	
	//'hugo'.save()
}