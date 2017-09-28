package org.javacream.groovy.demo;


import org.javacream.groovy.oop.static_types.Book

class IterationsDemo extends GroovyTestCase {

	void testGenerics(){
		//Durch Einsatz von Reflection völlig egal...
		List<Book> aList = new ArrayList<Book>();
		aList.add('Hugo');
		aList.add(42);
	}

	void testListIteration(){
		def aList = ['A', 'B', 'C'];
		print(aList);
	}

	void testListIteration2(){
		def aList = ['A', 'B', 'C'];
		Closure c = {element -> println "Element: $element"}

		aList.each c
	}

	void testRangeIteration(){
		def aRange = 1..3;
		print(aRange);
	}

	private void print(irgendwas){
		irgendwas.each {element -> println "Element: $element"}
	}
}
