package org.javacream.groovy.oop.static_types

trait Addressable {
	def city
	def street
	String getAddress(){
		return "city: ${city}, street: ${street}"
	} 
}
