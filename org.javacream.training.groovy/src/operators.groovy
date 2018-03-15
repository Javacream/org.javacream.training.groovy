//Operationen auf Variablen

//Mathematische Operationen: + - * /   % (Modulo, Ganzzahl-Division)


def n1 =20
def n2 = 42

def n3 = n1 + n2

def n4 = n1/n2 //Vorsicht:n4 ist eine Komma-Zahl

// Vergleichsoperatoren identität: ==, größer > größer gleich >= kleiner <, kleiner gleich <=, ungleich !=

def result = (n1 < n2) //result ist vom Typ her Boolean

result = (n1 + n4) > (n3 - n2/n1)

//Logischen Operationen: Negation: !, AND &&, OR ||

/*
AND true && true -> true
	true && false -> false 
	false && true -> false 
	false && false -> false 

OR  true || true -> true
	true || false -> true 
	false || true -> true 
	false || false -> false 


 */
def state1 = true
def state2= false

println state1 && state2

//Increment
def number = 1
number++  //number = number + 1

number +=5 //number = number + 5





