def returnFunc(x: Int, y: Int) : Int = x + y

def sum() : (Int, Int) => Int = {
returnFunc
}

val x = 3
val y = 2
val result = sum()
result(x,y)