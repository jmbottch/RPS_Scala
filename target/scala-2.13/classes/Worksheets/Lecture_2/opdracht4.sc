def returnFunc(x: Int, y: Int) : Int = x * y

def multiply() : (Int, Int) => Int = {
  returnFunc
}

val x = 3
val y = 2
val result = multiply()
result(x,y)