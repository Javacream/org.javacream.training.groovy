//Strukturierte Anwendungen

//def <function_name> (Komma-separierte Liste von Parametern){...}
def printMessage(def message){
    println("Message: ${message}")
    return "OK"
}

//Überladene Funktionen werden bei gleichem Namen an Hand der Parameterliste unterschieden
def printMessage(def name, def message){
    println("Message: ${message} from ${name}")
    return "OK"
}
/*
def printMessage(def p1, def p2){
    println("Message: ${message} from ${name}")
    return "OK"
}
*/
def greeting = "Hello"
printMessage(greeting)

def result = printMessage("World")
println(result)

result = printMessage("Sawitzki", "World")
println(result)
