package org.javacream.groovy.demo.dynamic

class DynamicObject {
	Object getProperty(String name){
		return 'it is a property!'
	}
	void setProperty(String name, Object value){
		println("setting property ${name} to ${value}")
		}
	def invokeMethod(String name, def args){
		println('executing invokeMethod')
		return "OK"
	}
}


