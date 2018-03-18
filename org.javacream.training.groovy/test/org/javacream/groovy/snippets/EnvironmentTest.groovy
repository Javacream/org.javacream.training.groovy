package org.javacream.groovy.snippets;

import groovy.util.GroovyTestCase;

class EnvironmentTest extends GroovyTestCase {

	void testReadEnvironment(){
		def env = System.getenv()
		println env
	}
}
