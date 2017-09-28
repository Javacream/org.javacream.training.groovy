package org.javacream.groovy.demo
twister = 'she sells sea shells at the sea shore of seychelles'

assert twister =~ /s.a/                                        

finder = (twister =~ /s.a/)                                    
assert finder instanceof java.util.regex.Matcher               

assert twister ==~ /(\w+ \w+)*/                                

WORD = /\w+/
matches = (twister ==~ /($WORD $WORD)*/)                       
assert matches instanceof java.lang.Boolean                    

assert (twister ==~ /s.e/) == false                            

wordsByX = twister.replaceAll(WORD, 'x')
assert wordsByX == 'x x x x x x x x x x'

words = twister.split(/ /)                                     
assert words.size() == 10
assert words[0] == 'she'

