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


def date = new Date().parse("dd.MM.yyy", '18.05.1988')
println date // Wed May 18 00:00:00 EEST 1988
def extendedDate = new Date().parse("dd.MM.yyy HH:mm:ss", '18.05.1988 12:15:00')
println extendedDate // Wed May 18 12:15:00 EEST 1988
