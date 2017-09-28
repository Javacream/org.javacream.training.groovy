package org.javacream.groovy.demo;

import groovy.json.JsonSlurper;
import groovy.text.SimpleTemplateEngine;
import groovy.text.SimpleTemplateEngine.SimpleTemplate;
import groovy.util.GroovyTestCase;

class TemplatingDemo extends GroovyTestCase {

	public void testJSON(){
		File f = new File('c:/_training/data/book_template.json')
		def template = new SimpleTemplateEngine().createTemplate(f);
		def binding = ["jsonTitle": "Hugo", "jsonPrice": 1.95]
		def result = template.make(binding)
		println result
		def book = new JsonSlurper().parseText(result.toString())
		println book.title
		println book.price
		
	}
}
