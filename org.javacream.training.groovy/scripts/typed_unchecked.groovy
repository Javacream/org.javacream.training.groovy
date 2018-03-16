def app(){
	List list = ["A", "B", "A", "C"]
	List numbers = [12, 42, 17]

	printList(list)
	printList(numbers)
	printList("Hugo")
	printList(42)
}

/**
 * Code assist will work, param is of type List
 * @param listToPrint
 * @return
 */
def printList(List listToPrint){
	//Type Check still necessary: Runtime does not perform any checks
	if (listToPrint instanceof List){
		for (def i = 0; i < listToPrint.size(); i++){
			println(listToPrint.get(i))
		}
	}else{
		println "wrong type forparameter ${listToPrint}"
	}
}

app()

