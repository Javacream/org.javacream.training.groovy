package org.javacream.groovy.demo;

import groovy.util.GroovyTestCase;

class ConfigTests extends GroovyTestCase {

	void testConfig1(){
		def config = new ConfigSlurper().parse(new URL('file:///c:/_training/config/config1.groovy'))
		println config.database.url
		println config.ldap.location
	}
	void testConfig2(){
		def config = new ConfigSlurper().parse(new URL('file:///c:/_training/config/config2.groovy'))
		println config.database.url
		println config.ldap.location
	}

	void testConfig1_Map(){
		def config = new ConfigSlurper().parse(new URL('file:///c:/_training/config/config1.groovy'))
		println config['database']['url']
		println config['ldap']['location']
	}
}
