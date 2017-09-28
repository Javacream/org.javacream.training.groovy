package org.javacream.groovy.demo;

import groovy.util.GroovyTestCase;

class ListTest extends GroovyTestCase {

	void testSimpleList(){

		def list = [1, 2, 3];
		Closure closure = { println it; }
		list.each (closure)

	}
}
