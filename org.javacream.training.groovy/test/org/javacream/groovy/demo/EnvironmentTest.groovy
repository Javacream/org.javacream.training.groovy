package org.javacream.groovy.demo;

import groovy.util.GroovyTestCase;

class EnvironmentTest extends GroovyTestCase {

	void testReadEnvironment(){
		def env = System.getenv()
		println env
	}
}
