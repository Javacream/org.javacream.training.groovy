package org.javacream.groovy.demo.dynamic.extend

class MixedIn {
	def mixedInMethod(){
		println "called mixedInMethod"
	}
}
@Mixin(MixedIn)
class Book{
	//...
}
Book b =new Book()
b.mixedInMethod()

class Person{
	//...
}
Person p = new Person()
Person p2 = new Person()
p.metaClass.mixin(MixedIn)
p.mixedInMethod()
//p2.mixedInMethod()