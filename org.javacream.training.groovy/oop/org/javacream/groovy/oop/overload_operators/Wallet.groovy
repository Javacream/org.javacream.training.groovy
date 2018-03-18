package org.javacream.groovy.oop.overload_operators

class Wallet {

	Money money = new Money(0)

	void leftShift(money){
		this.money += money
	}
	Money rightShift(amount){
		if (amount <= money.amount){
			money -= amount
		}else{
			throw new Exception('Not enough money')
		}
		return new Money(amount)
	}
}
