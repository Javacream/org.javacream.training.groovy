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