def numberCalc(x : Int) (strategy : (Int) =>  Boolean) : String = {
  x match {
    case some if strategy(some) => "You found the lucky number"
    case _ => "Sorry, try again"
  }
}
def normal(x : Int ) : Boolean = {
  x match {
    case 2  => true
    case _ => false
  }
}
def doubledWins(x : Int ) : Boolean = {
  x * 2 match {
    case 2 => true
    case _ => false
  }
}

def sqrtWins(x : Int) : Boolean = {
 math.sqrt(x) match {
   case 2 => true
   case _ => false
 }
}

//normal
//the number you enter must be exactly the lucky number
//it will match the input with the lucky number
numberCalc(2)(normal)
//doubled wins
//the number to win must be half of the lucky number
//because the input will be doubled, and then checked if it is equal to the lucky number
numberCalc(1)(doubledWins)
//sqrtWins
//your input must be the lucky number squared
//because it will take the square root of the input, and match that with the lucky number
numberCalc(4)(sqrtWins)

