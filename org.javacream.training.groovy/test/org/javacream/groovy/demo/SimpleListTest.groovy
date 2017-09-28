package org.javacream.groovy.demo;

import org.javacream.groovy.language.SimpleList;

import groovy.util.GroovyTestCase;

class SimpleListTest extends GroovyTestCase {

	void testSimpleList(){
	
			SimpleList list = new SimpleList();
			list.demoEach {e1, e2, e3, e4 ->
				println e1;
			}
		}
}
