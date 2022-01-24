//Aus Feature 2: Funktionale Programmierung

//name: ein Variablenname, "Hugo" ist ein Wert definiert über das Zeichenketten-Literal "..."
def name = "Hugo"
def number = 42
def state = true

//printMessageFunction ist ein Variablenname, { -> } ist das Funktions-Literal
def printMessageFunction = {message -> println("Message: ${message}")
    return "OK"
}

printMessageFunction("Hello")

def v2 = name
println(v2)

def result = printMessageFunction("Hello")
println(result)

def y = printMessageFunction //VORSICHT: Hier mit voller Absicht keine runden Klammern!
y("Fritz")

def functionWithStringParameter(def s){
    println(s)
}

def functionWithFunctionParameter(def f){
    f("Emil")
}

functionWithStringParameter("Hugo")
functionWithFunctionParameter(y)

