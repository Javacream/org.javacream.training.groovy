package org.javacream.groovy.application.store

class Lp {
	Object propertyMissing(name){
		return 'Hugo'
	}
	void propertyMissing(name, value){
		println "setting $name to $value"
	}
	
	def methodMissing(String name, args){
		println "i am executing $name using $args"
	}
}
