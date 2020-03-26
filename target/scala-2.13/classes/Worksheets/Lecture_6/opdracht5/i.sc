def simplePipe(value: List[Int => Int]): (Int) => Int = {
  value match {
//    case Nil => Nil
    case head::Nil => {
      head
    }
    case head::tail => {
      head andThen simplePipe(tail)
    }
  }
}

val computations = simplePipe(List(
  (x : Int) => x + 1,
  (x : Int) => x * 2,
  (x : Int) => x - 3
))

computations(3)