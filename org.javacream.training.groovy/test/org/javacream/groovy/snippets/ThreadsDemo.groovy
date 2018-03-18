package org.javacream.groovy.snippets

class Storage {
	List stack = []
	synchronized void leftShift(value){
		stack << value
		println "push: $value"
		notifyAll()                      
	}
	synchronized Object pop() {
		while (stack.isEmpty()) {
			try{ wait() }                
			catch(InterruptedException e){}
		}
		def value = stack.pop()
		println "pop : $value"
		return value
	}
}


Storage storage = new Storage()

Thread.start {
	for (i in 0..9) {                    
		storage << i                     
		sleep 100                        
	}                                    
}                                        

Thread.start {
	10.times {
		sleep 200                        
		value = storage.pop()            
	}                                    
}                                        

