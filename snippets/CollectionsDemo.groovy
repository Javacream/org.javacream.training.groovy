def listDemo(){
    def names = ["Emil", "Hugo", "Fritz"]
    for(name in names){
        println(name)
    }
}

def mapDemo(){
    def postalCodesToCity = [81371: "München", 30444: "Berlin"]
    for(code in postalCodesToCity.keySet()){
        println(code)
        println(postalCodesToCity.get(code))
    }
    println(postalCodesToCity.size())
}

def data(){
    def names = ["Emil", "Hugo", "Fritz", "Eduard", "Zvonimir", "Alexander"]
    names.forEach(name -> println(name))
    println("---")
    names.stream().filter(name -> name.startsWith("E")).forEach(name -> println(name))
    println("---")
    names.stream().filter(name -> name.startsWith("E")).map(name -> name.toUpperCase()).forEach(name -> println(name))
    println("---")
    names.stream().filter(name -> name.startsWith("E")).map(name -> name.length()).forEach(name -> println(name))
    println("---")
    println(names.stream().filter(name -> name.startsWith("E")).collect())

}

//listDemo()
//mapDemo()
data()