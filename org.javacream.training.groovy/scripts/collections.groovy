/*
 * [] : Das Listen-Literal, [Aufz�hlung von Elementen]
 * eine Liste enth�lt eine beliebige Anzahl von Elementen, die �ber eine Index-Zahl identifiziert werden
 */

def list = ["A", "B", "A", "C"]

/*
 * [] : Das Map-Literal [Aufzählung von Key: Value-Paaren]
 * eine Map enthält eine beliebige Anzahl von Elementen, die über den Key identifiziert werden
 */

def states = ["München": "Bayern", "Stuttgart": "BW", "Augsburg": "Bayern"]
def reverseStates = ["Bayern": ["München", "Augsburg", "Nürnberg"]]

println list[0] //-> "A"
println list[3] //-> "C"


println states["München"] //-> Bayern
println reverseStates["Bayern"][1]

//Jetzt als Zweizeiler
def citiesOfBavaria = reverseStates["Bayern"]
def secondCityOfBavaria = citiesOfBavaria[1]
println secondCityOfBavaria

println citiesOfBavaria

list[3] = "Hugo"
println list

list[4] = "Emil"
println list
println list[3]

reverseStates["Bayern"][3]="Neu-Ulm"
println reverseStates
