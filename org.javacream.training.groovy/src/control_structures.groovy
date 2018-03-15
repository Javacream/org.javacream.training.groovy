//Kontrollstrukturen: Schleifen und Verzweigungen

def n1 = 10
def n2 = 20

//Simples if
//Blöcke gruppieren Anweisungen, {   }
if (n1 < n2){
	println "n1 was smaller than n2"
}


//if else
if (n1 < n2){
	println "n1 was smaller than n2"
}else{
	println "n1 was greater than or equal to n2"
}

//if else if
if (n1 < n2){
	println "n1 was smaller than n2"
}else if (n1 == n2){
	println "n1 was equal to n2"
}else{
	println "n1 was greater than or equal to n2"

}

//for (start; bedingung; increment)
for (def i = 0; i < 10; i++){
	println (i)
}


//while(bedingung)
def counter = 0

while (counter < 5){
	println counter
	counter++
}


def name = "Hugo"

switch (name){
	case "Emil":
		println "name was Emil"
		break
	case "Egon":
		println "name was Egon"
		break
	case "Hugo":
		println "name was Hugo"
		break
	default:
		println "unknown name"
}



for (def j = 0; j < 10; j++){
	if (j < 5){
		println "smaller than 5"
	}else{
		println "greater than 5"

	}
}



