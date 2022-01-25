class SimpleUtility{
    def static main(String[] args){
        println(checkSubstringInString("Sawitzki", "wi"))
        println(checkSubstringInString("Sawitzki", "Wi"))
        println(checkSubstringInString("Sawitzki", "Saw"))
        println(numberOfOccurencesInString("Was soll das denn sein?", " y"))
        println(numberOfOccurencesInString("Was soll das denn sein?", " s"))
        println(numberOfOccurencesInString("Was soll das denn sein?", "s s"))
        def list = ["Emil", "Hugo", "Fritz", "Hugo"]
        println(checkElementInList(list, "Hugo"))
        println(checkElementInList(list, "ugo"))
        println(numberOfOccurencesInList(list, "Hugo"))
        println(numberOfOccurencesInList(list, "Emil"))
        println(numberOfOccurencesInList(list, "Eduard"))


    }

    def static checkSubstringInString(def string, def substring){
       return string.indexOf(substring) >= 0; 
    }
    def static numberOfOccurencesInString(def string, def substring){
        return string.split(substring).length - 1

    }
    def static checkElementInList(def list, def element){
       return list.contains(element); 
    }
    def static numberOfOccurencesInList(def list, def element){
       return list.stream().filter(e -> e == element).collect().size(); 
    }
}