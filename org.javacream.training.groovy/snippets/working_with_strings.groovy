String message = "Hello World Again"

println message.indexOf('l')

stringExamples(message)
def stringExamples(String s){
	List result = s.split("l")
	println result
	for(def i = 0; i < result.size; i++){
		println result[i]
	}
	
	for (def hugo in result){
		println hugo
		
	}
}

