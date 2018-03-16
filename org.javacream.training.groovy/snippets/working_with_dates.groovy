def actualDate = new Date()

println actualDate

def christmas = new Date(2017-1900, 11, 24)
println christmas

println christmas.format("dd/MM/yyyy")

println actualDate.before(christmas)
	
println actualDate.after(christmas)

def fromChristmasTillNow = christmas..actualDate

for (Date d in fromChristmasTillNow){
	println d
}

def yesterday = actualDate - 1
def tomorrow =actualDate + 1
println tomorrow

def firstDayOfMay = new Date(2018 - 1900, 4, 1)
def lastDayOfMay = new Date(2018 - 1900, 4, 31)
def daysInMay = firstDayOfMay..lastDayOfMay