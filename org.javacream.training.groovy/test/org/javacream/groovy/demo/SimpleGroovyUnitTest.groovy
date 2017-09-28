package org.javacream.groovy.demo;

import org.junit.Assert;
import org.junit.Test;

public class SimpleGroovyUnitTest extends GroovyTestCase{
	void testSimple(){
		this.assertLength(2, ["A","B"] as String[])
	}
}