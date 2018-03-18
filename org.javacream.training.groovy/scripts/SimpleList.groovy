class SimpleList {

	def elements = [57, 58, 59, 60];
	
	
	void demoEach(Closure c){
		for (element in elements){
			c.call(element, 'hugo', true, 42);
		}
	}
	
}
