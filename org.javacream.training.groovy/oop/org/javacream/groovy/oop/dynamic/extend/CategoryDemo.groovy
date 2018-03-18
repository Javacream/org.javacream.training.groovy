package org.javacream.groovy.oop.dynamic.extend
use (StringPlusCategory.class) {
	println "1" + 1
	println "1".plus("1")
	println "1" - "1"
	
}
println "a" + "1"
println "1".plus("1")

def list = []
def s = "Hugo"
def i = 1
def b = true
use (DemoCategory.class){
	println list.answer()
	println s.answer()
	println i.answer()
	// println b.answer() 
}