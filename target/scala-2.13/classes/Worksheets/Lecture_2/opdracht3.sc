def sum(x : Int) : (Int) => Int  = {
  def returnFunc(y: Int) : Int = x + y
  returnFunc
}

val result = sum(3)
result(4)