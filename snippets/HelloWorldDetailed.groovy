//Ein erstes Skript mit Konsolen-Ausgabe
/*
    Ein Mehrzeiliger Kommentar
*/

//Syntactic Sugar

println "HelloWorld"

//Eigentlich
println("HelloWorld");

//Arbeiten mit Variablen

//def <variablen-name> = Wert/Literal
def greeting = "HelloWorld"
println greeting

def number = 42

def realNumber = 4.2

def on = true
def off = false

//Zugriff auf Variablen zur Ausgabe

    //println ("Greeting=" + greeting + ", number=" + number)

    //Innerhalb einer Zeichenkette kann auf sichtbare Variablen mit ${...} zugegriffen werden
def output = "Greeting=${greeting}, number=${number}"
println output
//Laufzeitfehler:
//println outpu

//WARNUNG: Das folgende scheint zu funktionieren, ist aber schlechtester Stil und funktioniert auch nur in dieser speziellen Situtaion
undeclared_output = "Test"
println undeclared_output
//Groovy ist aktuell eine untypisierte Sprache
output = 4711
println output