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
def normalIf(x: Int) : Boolean = {
  if(x == 2) {
    true
  } else {
    false
  }
}


//normal
//the number you enter must be exactly the lucky number
//it will match the input with the lucky number
//this function uses pattern matching, this is a better way for functional programming than if/else
numberCalc(2)(normal)
//doubled wins
//the number to win must be half of the lucky number
//because the input will be doubled, and then checked if it is equal to the lucky number
//this function uses if/else, it is better to use pattern matching in functional programming
numberCalc(2)(normalIf)


