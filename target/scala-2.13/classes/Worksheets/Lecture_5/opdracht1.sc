//i exercise 2.3
def sum(x : Int) : (Int) => Int  = {
  def returnFunc(y: Int) : Int = x + y
  returnFunc
}

val result = sum(3)
result(4)

//closure == returnFunc

println("Original integers")
val x = 3
val y = 2
def returnMultiplyFunc(x: Int, y: Int) : Int = x * y
def multiply() : (Int, Int) => Int = {
  returnMultiplyFunc
}
def returnSumFunc(x: Int, y: Int) : Int = x + y
def sum() : (Int, Int) => Int = {
  returnSumFunc
}

def applyFunc(x : Int, y : Int, f:( Int, Int ) => Int) : Int = {
  f(x,y)
}

val sumresult = applyFunc(x, y, sum())
println("Outcome on sum : " + x + " + " + y + " = " + sumresult )

val multiplyResult = applyFunc(x, y, multiply())
println("Outcome on multiply : " + x + " x " + y + " = " + multiplyResult )

//there is no closure here, we cannot call the functions otherwise.

//iii
val x3 = 3
val luckyNumber = 3

def lucky(y: Int) :  (Int) => String = {
  def compare(x:Int) : String = {
    x match {
      case x if x == y => "You found the lucky number"
      case _ => "Try again"
    }
  }
  compare
}
val luckyResult = lucky(3)
luckyResult(3)

//compare is the closure
//this encloses x,
//lucky doesnt know x but compare does






