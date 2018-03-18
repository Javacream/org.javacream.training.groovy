

class Person {

	String lastname
	String firstname
	Integer height
	
	String greet(){
		return "Hello, my name is ${firstname} ${lastname}"
	}
	
	Person(String pLastname, String pFirstname, Integer height){
		lastname = pLastname
		firstname = pFirstname
		this.height = height
	}
}
