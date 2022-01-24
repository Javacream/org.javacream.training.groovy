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


listDemo()
mapDemo()