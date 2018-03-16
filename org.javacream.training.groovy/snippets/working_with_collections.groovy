List elements = ["A", "C", "B", "AA", "Z1", "FF"]
Map states = ["München": "Bayern", "Stuttgart": "BW", "Augsburg": "Bayern"]
 
for (String element in elements){
	println element
}

for (def element in states){
	println element
}
println ("#################")

for (String key in states.keySet()){
	print key
	print "::"
	def value = states.get(key)
	print value
	println "${key} :: ${states.get(key)}"
}
println ("#################")

for (String value in states.values()){
	println value
}
