package org.javacream.demo

class SimpleApplication{
    def static main(String[] args){
        println ("Hello from SimpleApplication")
        println(SimpleApplication.checkNameBeginsWithH("Sawitzki"))
        println(SimpleApplication.checkNameBeginsWithH("Hugo"))

    }

    def static checkNameBeginsWithH(def name){
        def result = name.startsWith("H")
        return result
    }
}