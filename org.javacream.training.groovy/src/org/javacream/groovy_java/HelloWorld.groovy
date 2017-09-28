package org.javacream.groovy_java

class HelloWorld extends Object implements Serializable{

	String demo1
	int demo2
	List liste
	Map<String, String> map
	def demo3
	
	{
		demo1='Hugo'
		demo2 = 42
		liste = [1, 2, 3, 4]
		map = ['key': 'value1', key2: 'value2']
	}
	
	String getDemo1(){
		println("retrieving demo1... ");
		return demo1;
	}
	String sayHello(){
		
		def local = "demoValue"
		
//		return "demo1=" + demo1 + ", demo2=" + demo2 + ", liste=" + liste;
		return "demo1=$demo1, demo2=$demo2, liste=$liste, local=$local, demo3=$demo3, map=$map";
			}
}

