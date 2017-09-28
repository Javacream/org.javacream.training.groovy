package org.javacream.groovy.demo

class Whatever {
	int outer(){
		return inner()
	}
	int inner(){
		return 1
	}
}

def tracer = new TracingInterceptor()                  
def proxy = ProxyMetaClass.getInstance(Whatever.class) 
proxy.interceptor = tracer
def whatever
proxy.use {                                            
	whatever = new Whatever()
	whatever.outer()
}
//whatever.outer()

