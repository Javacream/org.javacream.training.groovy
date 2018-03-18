def myFunc(){
	def innerVar = 42
	def innerFunc = {
		println ("From innerFunc: ${innerVar}")
	}
	innerFunc()
}
myFunc()

def myFunc2(){
	def innerVar = 42
	def innerFunc = {
		println ("From innerFunc2: ${innerVar}")
	}
	return innerFunc
}
def f = myFunc2()
f()