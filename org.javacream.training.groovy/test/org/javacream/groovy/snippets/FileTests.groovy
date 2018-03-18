package org.javacream.groovy.snippets;

import groovy.util.GroovyTestCase;

class FileTests extends GroovyTestCase {

	void testFileReader(){
		File f = new File("Y:/git/org.javacream.training.groovy/org.javacream.training.groovy/data/test.txt");
		f.each {println it.next()}
		List lines = f.readLines();
		println lines
	}

	void testShift(){
		File f = new File('Y:/git/org.javacream.training.groovy/org.javacream.training.groovy/data/test.txt')
		StringWriter writer = new StringWriter()
		f.each {writer << it << '\n'}
		println writer
	}
}
