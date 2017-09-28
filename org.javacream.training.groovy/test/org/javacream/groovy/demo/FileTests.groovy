package org.javacream.groovy.demo;

import groovy.util.GroovyTestCase;

class FileTests extends GroovyTestCase {

	void testFileReader(){
		File f = new File("c://_training/test.txt");
		f.each {println it.next()}
		List lines = f.readLines();
		println lines
	}

	void testShift(){
		File f = new File('c:/_training/test.txt')
		StringWriter writer = new StringWriter()
		f.each {writer << it << '\n'}
		println writer
	}
}
