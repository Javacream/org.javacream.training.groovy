package org.javacream.groovy.demo.dynamic;

import org.javacream.groovy.demo.dynamic.InvokeMethodsDemo;

import groovy.util.GroovyTestCase;

class InvokeMethodTest extends GroovyTestCase {

	void testInvokeMethod(){
		InvokeMethodsDemo d = new InvokeMethodsDemo();
		d.doAll();
	}
}
