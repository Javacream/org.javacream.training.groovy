//JasperReports schlägt vor, Hilfsfunktionen als static zu definieren

class HelloWorld{
    def sayHello(){
        println("Hello World!")
    }
    def static sayHelloStatic(){
        println("Hello World Static!")
    }
}

def hw = new HelloWorld()
hw.sayHello()
HelloWorld.sayHelloStatic()