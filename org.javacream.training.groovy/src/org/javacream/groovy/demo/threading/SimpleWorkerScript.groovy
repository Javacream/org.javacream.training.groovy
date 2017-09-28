package org.javacream.groovy.demo.threading

class StartWork{

	def startWork(){
		SimpleWorker worker1 = new SimpleWorker()
		SimpleWorker worker2 = new SimpleWorker()
		SimpleWorker worker3 = new SimpleWorker()

		Thread.start {worker1.work 'action1'}
		Thread.start {worker2.work 'action2'}
		Thread.start {worker2.work 'action3'}
	}
}

new StartWork().startWork()