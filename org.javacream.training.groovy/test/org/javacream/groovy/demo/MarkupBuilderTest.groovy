package org.javacream.groovy.demo;

import groovy.util.GroovyTestCase;
import groovy.xml.MarkupBuilder;

class MarkupBuilderTest extends GroovyTestCase {

	void testMarkupBuilder(){
		StringWriter writer = new StringWriter();
		MarkupBuilder builder = new MarkupBuilder(writer)
		def invoicesXml = builder.invoices{
			for (day in 1..3){
				invoice ("date": new Date(112,2,day)){
					item("count": day){
						product("name": 'EUR', "price": 999)
					}
				}
			}
		}
		println writer.toString()
	}
}
