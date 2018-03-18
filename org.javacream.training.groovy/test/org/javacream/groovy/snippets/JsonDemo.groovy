package org.javacream.groovy.snippets;

import groovy.json.JsonSlurper;
import groovy.text.SimpleTemplateEngine;
import groovy.text.SimpleTemplateEngine.SimpleTemplate;
import groovy.util.GroovyTestCase;

class JsonDemo extends GroovyTestCase {

	public void testJSON(){
		URL url = new URL('file:///Y:/git/org.javacream.training.groovy/org.javacream.training.groovy/data/book.json')
		def book
		url.withReader{
			book = new JsonSlurper().parse(it)
		}
		println book.title
		println book.price
	}
}
