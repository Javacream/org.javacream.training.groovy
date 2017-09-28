package org.javacream.groovy.language

List list = ["X", "A", "X", "B"]

list.each {print it}
println()
def start = 1
def r
r = list.findIndexOf(start, {element -> return element.equals("X")})
println(r)
r = list.findIndexOf start, {element -> return element.equals("X")}
println(r)
r = list.findIndexOf(start) {element -> return element.equals("X")}
println(r)