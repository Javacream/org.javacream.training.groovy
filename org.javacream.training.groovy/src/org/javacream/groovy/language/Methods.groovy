package org.javacream.groovy.language

println doSomething('Test')

def doSomething(message){
	
	println "executing something, message = $message"
	return "OK"
}

doSomething('Test')
doSomething()
