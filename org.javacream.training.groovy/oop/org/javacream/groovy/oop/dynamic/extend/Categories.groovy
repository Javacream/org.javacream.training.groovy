package org.javacream.groovy.oop.dynamic.extend

class StringPlusCategory {
	static def plus(String self, String operand) {
			return self.toInteger() + operand.toInteger()
	}
	static def minus(String self, String operand) {
			return "hugo"
	}
}

class DemoCategory {
	static def answer(String self){
		return 57 
	}
	static def answer(List self){
		return 58 
	}
	static def answer(Integer self){
		return 59 
	}

}
