List elements = ["A", "C", "B", "AA", "Z1", "FF"]
Map states = ["München": "Bayern", "Stuttgart": "BW", "Augsburg": "Bayern"]
 
for (String element in elements){
	println element
}

for (def element in states){
	println element
}
println ("#################")

for (String hugo in states.keySet()){
	print hugo
	print "::"
	def valueForKey = states.get(hugo)
	print valueForKey
	println "${hugo} :: ${states.get(hugo)}"
}
println ("#################")

for (String value in states.values()){
	println value
}



