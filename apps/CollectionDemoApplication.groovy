class CollectionsDemo{
    def static listDemo(){
        def names = ["Emil", "Hugo", "Fritz"]
        names.add("Eduard")
        for(name in names){
            println(name)
        }
        println(names.contains("Eduard"))
        println(names.contains("Eduardo"))
}
}

CollectionsDemo.listDemo()