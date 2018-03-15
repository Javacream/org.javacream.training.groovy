/*
 * [] : Das Listen-Literal, [Aufz�hlung von Elementen]
 * eine Liste enth�lt eine beliebige Anzahl von Elementen, die �ber eine Index-Zahl identifiziert werden
 */

def list = ["A", "B", "A", "C"]

/*
 * [] : Das Map-Literal [Aufz�hlung von Key: Value-Paareb]
 * eine Map enth�lt eine beliebige Anzahl von Elementen, die �ber den Key identifiziert werden
 */

def states = ["M�nchen": "Bayern", "Stuttgart": "BW"]
def reverseStates = ["Bayern": ["M�nchen", "Augsburg", "N�rnberg"]]

println list[0] //-> "A"
println list[3] //-> "C"


println states["M�nchen"] //-> Bayern
println reverseStates["Bayern"][1]

//Jetzt als Zweizeiler
def citiesOfBavaria = reverseStates["Bayern"]
def secondCityOfBavaria = citiesOfBavaria[1]
println secondCityOfBavaria

println citiesOfBavaria