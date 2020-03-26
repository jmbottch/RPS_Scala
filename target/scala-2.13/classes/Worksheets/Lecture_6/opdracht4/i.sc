def numberCalc(x : Int) (strategy : (Int) =>  Boolean) : String = {
  x match {
    case some if strategy(some) => "You found the lucky number"
    case _ => "Sorry, try again"
  }
}
def lucky(x : Int ) : Boolean = {
  x match {
    case 2 => true
    case _ => false
  }
}


numberCalc(3)(lucky)
