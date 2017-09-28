package org.javacream.groovy.application.warehouse;

import org.javacream.groovy.application.books.Book
import org.javacream.groovy.application.store.Cd
import org.javacream.groovy.application.store.Lp


class BasketTest extends GroovyTestCase {

	void testBasket(){
		Book book = new Book('isbn1', 'title1', 200, 19.99, true)
		Book book2 = new Book('isbn2', 'title2', 200, 39.99, true)
		Cd cd  = new Cd(title:"Sgt. Pepper", artist:'The Beatles', price: 16.45 )
		Cd cd2  = new Cd(title:"Revolver", artist:'The Beatles', price: 19.99 )
		
		Basket basket = new Basket();
		basket.add book
		basket.add book2
		basket.add cd
		basket.add cd2
		
		println basket.totalPrice
		
		def dvd = [title: "Life of Brian", duration: 101, price: 5.55]
		basket.add dvd
		println basket.totalPrice
		
		println dvd['title']
		println dvd.title
		
		println cd.artist
		println cd['artist']

		def fieldname = 'duration'
		println dvd["$fieldname"]

		dvd.put("hello", "World")		
		println dvd.hello	
		
//		cd.hello = "World"	
		def lp = new Lp()
		lp.darkSideOfTheMoooooon = 'Pink Floyd'
		lp.play()
//		ObjectBrowser.inspect cd
//		
//		def sync = new Object()
//		synchronized(sync){
//			sync.wait()
//		}
		
		

	}

}
