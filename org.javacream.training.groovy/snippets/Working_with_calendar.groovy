
def c = new GregorianCalendar(2002, Calendar.FEBRUARY, 2)

def actualDate = new Date();
def c2 = actualDate.toCalendar();
println  c2[Calendar.YEAR]

GregorianCalendar date = new GregorianCalendar(2014, 10 - 1, 1, 0, 0, 0)
println TimeZone.getTimeZone('GMT+5').rawOffset / 60 / 60 / 1000

date.setTimeZone(TimeZone.getTimeZone('GMT+5')); 
date.get(Calendar.HOUR_OF_DAY); 

date.set(Calendar.DATE, 1);
date.set(Calendar.HOUR_OF_DAY, 0);
println String.format('%tY-%<tm-%<td %<tH:%<tM:%<tS %<tZ', date)
println date.time
println date.time.toTimestamp()
println '---'

date.setTimeZone(TimeZone.getTimeZone('GMT+3')); // Moscow
println String.format('%tY-%<tm-%<td %<tH:%<tM:%<tS %<tZ', date)
println date.time
println date.time.toTimestamp()