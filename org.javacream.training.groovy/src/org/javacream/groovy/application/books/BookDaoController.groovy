package org.javacream.groovy.application.books

import java.sql.SQLException;

import org.javacream.groovy.util.Dao

class BookDaoController {

	Random random = new Random()
	Dao dao = new Dao();
	String insertBook(title, pages, price){
		def isbn = 'Isbn' + random.nextInt()
		dao.doInStatement {
			it.executeUpdate("insert into books (isbn, title, pages, price) values('$isbn', '$title', $pages, $price)")
		}
		return isbn
	}

	def findBookByIsbn(isbn){
		def book
		dao.doInStatement {
			def rows = it.executeQuery("select * from books where isbn = '$isbn'")
			try{
				rows.next()
				book = new Book(rows.getObject(1), rows.getObject(2), rows.getObject(3), rows.getObject(4), false);
			}
			catch(SQLException e){
				book = null
			}
		}
		return book
	}

	void deleteBookByIsbn(isbn){
		dao.doInStatement {
			def rows = it.executeUpdate("delete from books where isbn = '$isbn'")
		}
	}
	void updateBook(book){
		dao.doInStatement {
			def rows = it.executeUpdate("update books set title = '$book.title', price=$book.price, pages=$book.pages, available=$book.available where isbn = '$book.isbn'")
		}
	}
}
