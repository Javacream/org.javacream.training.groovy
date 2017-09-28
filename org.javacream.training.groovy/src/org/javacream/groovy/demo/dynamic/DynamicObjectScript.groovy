package org.javacream.groovy.demo.dynamic

DynamicObject book = new DynamicObject()
book.isbn = "ISBN1"
println book.isbn

println book.printBook()