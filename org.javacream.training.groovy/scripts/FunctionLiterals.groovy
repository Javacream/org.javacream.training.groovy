def myFunc = {x, y -> return x + y}
println myFunc(1, 2)
println(myFunc.getClass().getName())


def myFunc2(x, y) {
	return x + y
}

println myFunc2(1, 2)
//println(myFunc2.getClass().getName())
