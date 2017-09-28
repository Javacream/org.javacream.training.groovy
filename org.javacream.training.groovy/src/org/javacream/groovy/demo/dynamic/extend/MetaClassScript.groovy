package org.javacream.groovy.demo.dynamic.extend

class Dvd {
	//...
}
Dvd d1 = new Dvd()
Dvd d2 = new Dvd()
println "d1.metaClass: " + d1.metaClass
println "d2.metaClass: " + d2.metaClass
println "DVD.metaClass: " + Dvd.metaClass

d1.metaClass.myMethod = {-> println "d1: " + delegate}
Dvd.metaClass.myMethod = {-> println "Dvd: " + delegate}

println "d1.metaClass: " + d1.metaClass
println "d2.metaClass: " + d2.metaClass
println "DVD.metaClass: " + Dvd.metaClass

Dvd d3 = new Dvd();
println "d3.metaClass: " + d3.metaClass

d1.myMethod()
// d2.myMethod()
d3.myMethod()
