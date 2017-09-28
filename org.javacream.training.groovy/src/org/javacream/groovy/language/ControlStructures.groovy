package org.javacream.groovy.language

list = [1, 2, 3]

if (list.size == 3){
	println 'Size was three'
}else{
	println 'Size was not three'
}

switch (list.size)

{
	case 1: println '1'; break
	case 2: println '2'; break
	case 3: println '3'; break
}