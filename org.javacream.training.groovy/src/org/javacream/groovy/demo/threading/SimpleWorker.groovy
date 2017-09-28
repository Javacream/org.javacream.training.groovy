package org.javacream.groovy.demo.threading

import java.util.concurrent.CyclicBarrier;

class SimpleWorker {
	CyclicBarrier barrier = new CyclicBarrier(4);
	def work(String action){
		println "start working for action $action"
		Thread.start{subUnitOfWork1(action)}
		Thread.start{subUnitOfWork2(action)}
		Thread.start{subUnitOfWork3(action)}
		barrier.await();
		println "work finished for action $action"
	}
	
	private def subUnitOfWork1(action){
		println "starting subUnitOfWork1 for action $action"
		Thread.sleep(200);
		println "finished subUnitOfWork1 for action $action"
		barrier.await();
		
	}
	private def subUnitOfWork2(action){
		println "starting subUnitOfWork2 for action $action"
		Thread.sleep(700);
		println "finished subUnitOfWork2 for action $action"
		barrier.await();
		
	}
	private def subUnitOfWork3(action){
		println "starting subUnitOfWork3 for action $action"
		Thread.sleep(100);
		println "finished subUnitOfWork3 for action $action"
		barrier.await();
		
	}
}
