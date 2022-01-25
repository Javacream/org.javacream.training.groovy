class CollectionsDemo{
    def static listDemo(){
        def names = ["Emil", "Hugo", "Fritz"]
        names.add("Eduard")
        names.add("Hugo")
        for(name in names){
            println(name)
        }
        println(names.contains("Eduard"))
        println(names.contains("Eduardo"))
}
    def static setDemo(){
        //def names = new HashSet()
        def names = ["Emil", "Hugo", "Fritz"] as Set
        names.add("Emil")
        names.add("Hugo")
        names.add("Fritz")
        names.add("Eduard")
        names.add("Hugo")
        for(name in names){
            println(name)
        }
        println(names.contains("Eduard"))
        println(names.contains("Eduardo"))
}
}

CollectionsDemo.setDemo()