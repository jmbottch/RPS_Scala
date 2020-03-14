val x = 3
val luckyNumber = 3

def compare(input: Int) : String = {
  if(input == luckyNumber) "You found the lucky number"
  else "Sorry, try again"
}
def lucky:(Int) => String = {
  compare
}
println(lucky(x))