package org.javacream.groovy.language

list = [1, 2, 3]

for (i = 0; i < list.size; i++){
	println list[i]
}

for (element in list){
	println element
	
}

counter = 0
while (counter < list.size){
	println list[counter]
	counter++;
}