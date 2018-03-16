def app(){
	def list = ["A", "B", "A", "C"]
	def numbers = [12, 42, 17]

	printList(list)
	printList(numbers)
	printList("Hugo")
	printList(42)
}

def printList(def listToPrint){
	if (listToPrint instanceof List){
		for (def i = 0; i < listToPrint.size(); i++){
			println(listToPrint.get(i))
		}
	}else{
		println "wrong type forparameter ${listToPrint}"
	}
}

app()

