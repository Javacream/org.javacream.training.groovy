package org.javacream.groovy.application.warehouse

class Basket {

	List items =[]
	
	def add(item){
		items.add(item)
	}
	
	def remove(item){
		items.remove(item)
	}
	
	def info(){
		return items.toString()
	}
	
	double getTotalPrice(){
		double result = 0
		for (item in items){
			result += item.price
		}
		return result
	}

	
}
