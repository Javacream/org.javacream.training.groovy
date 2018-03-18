package org.javacream.groovy.application.books

class BookController {

	static Map books = new HashMap()

	static{
		(1..<10).each {
			//def book = new Book(isbn: "Isbn$it", title: "Title$it", pages: 42, price: 19.99, available: false)
			def book = new Book("Isbn$it", "Title$it", it, 1.99*it, false)
			books.put book.isbn, book
			book.keywords = ['politics', 'sports']
			Calendar calendar = Calendar.instance
			calendar.set(2012, 1, it);
			book.publishingDate = calendar.time
		}
	}

	Random random = new Random()

	String insertBook(title, pages, price){
		def isbn = 'Isbn' + random.nextInt()
		def book = new Book(isbn, title, pages, price, false)
		books.put(isbn, book)
		return isbn
	}

	def findBookByIsbn(isbn){
		return books.get(isbn)
	}

	void deleteBookByIsbn(isbn){
		books.remove(isbn)
	}
	void updateBook(book){
		books.put(book.isbn, book);
	}

	def findBooksByPriceRange(priceRange){
		return books.values().findAll {Book book ->
			return priceRange.containsWithinBounds(book.price)
		}
	}
	
	def findBooksByPublishingDate(dateRange){
		return books.values().findAll {Book book ->
			return dateRange.containsWithinBounds(book.publishingDate)
		}
	}

	def getAvailableIsbns(){
		return books.keySet()
	}


	def getKeywords(){
		def keywords = new HashSet();
		books.values().each {book -> book.keywords.each { keywords.add it}}
		return keywords
	}

	void load (filename){
		File f = new File(filename)
		def lines = f.readLines()
		Book book = new Book(lines[0], lines[1], lines[2].toInteger(), lines[3].toDouble(), lines[4].toBoolean())
		books.put(book.isbn, book);
	}
	void slurp (){
		def config = new ConfigSlurper().parse(new URL('file:///c:/_training_groovy/config/book1.groovy'))
		def book = config.book
		book.keywords = ['dies', 'das']
		books.put(book.isbn, book);
	}

	void dump (filename){
		File f = new File(filename)
		books.values().each {book -> f.append("${book.toString()} \n")}
	}

	void saveBookList(filename){
		File f = new File(filename)
	}
}
