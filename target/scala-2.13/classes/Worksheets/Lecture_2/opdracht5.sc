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
