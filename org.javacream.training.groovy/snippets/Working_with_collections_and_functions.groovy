List elements = ["A", "C", "B", "AA", "Z1", "FF"]
//elements.forEach({element -> println element})
//elements.sort({String e1, String e2 -> return -e1.compareTo(e2)})
//elements.forEach({element -> println element})


//def result = elements.stream().filter({String e -> e.startsWith("A")}).count()
//println result

//Kompaktvariante
elements.stream().filter({String element -> element.size() == 1}).map({String element -> element.toLowerCase()}).forEach({element -> println element} )


//Ausgeschrieben
//Definiere die Verarbeitungsschritte als Funktionsobjekte
def filterCriterion = {String element -> element.size() == 1}
def toLowerCaseTransformation = {String element -> element.toLowerCase()}
def iterationStep = {element -> println element}

//Starte den Ablauf/Workflow/die Pipelive...
def streamingList = elements.stream()
def filteredElements = streamingList.filter(filterCriterion)
def transformedElements = filteredElements.map(toLowerCaseTransformation)
transformedElements.forEach(iterationStep)

/*So ginge es ohne streaming-API
List elementsWithSizeOne = []
for (def i = 0; i < elements.size; i++){
	String element = elements.get(i)
	if (element.size() == 1){
		elementsWithSizeOne.add(element)
	}
}

for (String elementsWithSizeOne

*/