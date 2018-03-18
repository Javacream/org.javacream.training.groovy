Person sawitzki = new Person("Sawitzki", "Rainer", 183)

println sawitzki.greet()

Bicycle b = new Bicycle("4Gang", sawitzki)
b.info()
class Bicycle{
	String type
	Person owner
	
	Bicycle(String type, Person owner){
		this.type =type
		this.owner = owner
	}
	
	String info(){
		println "${type}, owner is ${owner?.lastname}"
	}

}


Bicycle b2 = new Bicycle("2-Gang", null)

b2.info()
b2.owner?.greet()
