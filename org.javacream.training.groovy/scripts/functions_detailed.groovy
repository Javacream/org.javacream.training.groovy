//name ist eine Referenz auf ein Objekt vom Typ String im Heap mit dem Inhalt Hugo
def name = "Hugo"

def number = 9

def f = {param -> 
	println "I am a function with param ${param}"
}

f(name)

