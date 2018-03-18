package org.javacream.groovy.oop.static_types

class DelegateDemo {
	def delegateDemo(){
		MyList list = new MyList()
		list.add("element1")
		println list.size()
		list.myMethod()
	}
}

class MyList{
	@Delegate LinkedList delegate = new LinkedList()
	def myMethod(){
		println "called myMethod"
	}
}
new DelegateDemo().delegateDemo()
