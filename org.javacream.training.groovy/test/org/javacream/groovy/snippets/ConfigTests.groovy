package org.javacream.groovy.snippets;

import groovy.util.GroovyTestCase;

class ConfigTests extends GroovyTestCase {
	String baseUrl = "file:///Y:/git/org.javacream.training.groovy/org.javacream.training.groovy/data"
	void testConfig1(){
		def config = new ConfigSlurper().parse(new URL("${baseUrl}/config1.groovy"))
		println config.database.url
		println config.ldap.location
	}
	void testConfig2(){
		def config = new ConfigSlurper().parse(new URL("${baseUrl}//config2.groovy"))
		println config.database.url
		println config.ldap.location
	}

	void testConfig1_Map(){
		def config = new ConfigSlurper().parse(new URL("${baseUrl}//config1.groovy"))
		println config['database']['url']
		println config['ldap']['location']
	}
}
