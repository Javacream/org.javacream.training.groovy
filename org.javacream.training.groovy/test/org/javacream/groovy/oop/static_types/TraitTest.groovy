package org.javacream.groovy.oop.static_types;

import static org.junit.Assert.*
import groovy.transform.ToString

import org.junit.Test

class TraitTest {
	@Test
	public void testTrait() {
		Person p  = new Person(lastname: "Name", given_name: "Hans", city: "Frankfurt", street: "Stresemannallee 4")
		Hotel h = new Hotel(name: "park Inn", city: "Berlin", street: "Alexanderstrasse 18")
		println p.address
		println h.address
	}
}
class Person implements Addressable{
	def lastname
	def given_name
}
class Hotel implements Addressable{
	def name
}