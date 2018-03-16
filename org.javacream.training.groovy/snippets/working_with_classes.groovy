import org.javacream.school.Person;

Person sawitzki = new Person("Sawitzki", "Rainer", 183)

println sawitzki.greet()

Bicycle b = new Bicycle("4Gang", sawitzki)
print b.info()
class Bicycle{
	String type
	Person owner
	
	Bicycle(String type, Person owner){
		this.type =type
		this.owner = owner
	}
	
	String info(){
		return "${type}, owner is ${owner.lastname}"
	}
}