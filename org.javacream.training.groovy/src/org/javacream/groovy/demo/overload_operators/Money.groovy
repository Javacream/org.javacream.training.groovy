package org.javacream.groovy.demo.overload_operators

class Money {
	Money(amount){
		this.amount = amount
	}
	double amount
	Money plus(Money other){
		Money money = new Money(this.amount + other.amount)
		return money
	}
	Money minus(Money other){
		Money money = new Money(this.amount - other.amount)
		return money
	}
	Money plus(Double other){
		Money money = new Money(this.amount + other)
		return money
	}
	Money minus(Double other){
		Money money = new Money(this.amount - other)
		return money
	}

	Money multiply(other){
		Money money = new Money(this.amount * other)
		return money
	}
	Money div(other){
		Money money = new Money(this.amount / other)
		return money
	}
}
