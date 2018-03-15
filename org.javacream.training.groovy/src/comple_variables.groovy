/*
 * [] : Das Listen-Literal, [Aufzählung von Elementen]
 * eine Liste enthält eine beliebige Anzahl von Elementen, die über eine Index-Zahl identifiziert werden
 */

def list = ["A", "B", "A", "C"]

/*
 * [] : Das Map-Literal [Aufzählung von Key: Value-Paareb]
 * eine Map enthält eine beliebige Anzahl von Elementen, die über den Key identifiziert werden
 */

def states = ["München": "Bayern", "Stuttgart": "BW"]
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