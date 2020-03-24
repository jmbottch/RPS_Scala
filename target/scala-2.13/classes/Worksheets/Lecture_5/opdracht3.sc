def makeCounter() : (() => Int, () => Int) = {
  var count = 0
  def increment() : Int = {
    count += 1
    count
  }

  def decrement() : Int = {
    count -=1
    count
  }

  (increment, decrement)
}

val (incr, decr) : (() => Int , () => Int) = makeCounter()
incr()
decr()
incr()
incr()
decr()