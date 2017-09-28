package org.javacream.groovy.demo;

import groovy.json.JsonSlurper;
import groovy.text.SimpleTemplateEngine;
import groovy.text.SimpleTemplateEngine.SimpleTemplate;
import groovy.util.GroovyTestCase;

class JsonDemo extends GroovyTestCase {

	public void testJSON(){
		URL url = new URL('file:///c:/_training/data/book.json')
		def book
		url.withReader{
			book = new JsonSlurper().parse(it)
		}
		println book.title
		println book.price
	}
}
