//Zeilenkommentar

/*
 * Einführung von Variablen und Literalen 
 */

//def <variablen_name> = Literal
def output


def greeting = "Hello" //"..." : Zeichenketten-Literal, String
def number = 42 //42 Ganzzahl-Literal
def realNumber = 47.11 //Kommazahl-Literal
def decision = true //true | false: Logische Literal

/*
print message //Ausgabe der Variable message
print " "
print number
print " "
print realNumber
println ""

*/
output =  "message=${greeting}, Number=${number}, "
println output

//Wertzuweisung an eine vorhandene Variable, kein def notwendig
output = "Hallo"
println output

output = 42

output = false

println output
