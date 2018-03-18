package org.javacream.groovy.oop.overload_operators;


import groovy.util.GroovyTestCase;

class FinanceTests extends GroovyTestCase {

	void testMoney(){
		Money money1 = new Money(1)
		Money money2 = new Money(2)

		Money sum = money1 + money2
		assertTrue sum.amount == 3
		Money diff = money2 - money1
		assertTrue diff.amount == 1

		Money product = money2 * 3
		assertTrue product.amount == 6

		Money div = money2 / 4
		assertEquals div.amount, 0.5, 1e-9
	}

	void testWallet(){
		Money money1 = new Money(1)
		Money money2 = new Money(2)
		Wallet wallet = new Wallet()
		wallet << money1
		wallet << money2

		Money money = wallet >> 2
		assertTrue money.amount == 2
		try{
			money = wallet >> 2
			fail 'wallet cannot contain enough money!'
		}
		catch(Exception e){
			assertTrue e.message == 'Not enough money'
		}
	}
}