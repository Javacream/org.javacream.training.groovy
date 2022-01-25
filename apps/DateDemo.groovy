package org.javacream.demo

class DateDemo{
    def static main(args) {
     def actualDate = new Date()
     println(actualDate)
     def date = Date.parse("dd.MM.yyyy", "19.05.2001")
     println(date)
     println(date.format("dd/MM/yyyy"))
     println(date + 5)
     println(date.plus(3))
     println(date.getMonth()) 
    }
}