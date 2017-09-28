package org.javacream.groovy.demo.dynamic

import org.codehaus.groovy.runtime.InvokerHelper

class InvokeMethodsDemo implements GroovyInterceptable{
	Writer writer = new PrintWriter(System.out)
	private int indent = 0
	Object invokeMethod(String name, Object args){
		writer.write("\n" + ' '*indent + "before method '$name' \n")
		writer.flush()
		indent++
		def metaClass = InvokerHelper.getMetaClass(this)
		def result = metaClass.invokeMethod(this, name, args)
//		def result = super.invokeMethod(name, args)
		indent--
		writer.write("\n" + ' '*indent + "after method '$name' \n")
		writer.flush()
		return result
	}
	void doThis(){
		System.out.println "#### doing this ####"
	}

	void doThat(){
		System.out.println "#### doing that ####"
	}

	void doAll(){
		System.out.println "#### doing all ####"
		doThis()
		doThat()
	}
}
