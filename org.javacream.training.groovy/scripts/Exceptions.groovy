println doSomething('Test')

def doSomething(message) throws Exception{
	println "executing something, message = $message"
	if (!message){
		throw new Exception("TEST")
	}
	return "OK"
}

doSomething('Test')
try{
	doSomething()
}
catch(Exception e){
	println "catched exception $e"
}