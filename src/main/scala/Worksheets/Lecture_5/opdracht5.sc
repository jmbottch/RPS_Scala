def range(start: Int, end: Int, stepSize: Int): () => Option[Int] = {
  var first = true
  var value : Int = start
  def calculateNext() : Option[Int] = {

    value match {
        case _ if first => {
          first = false
          Some(value)
        }
        case  _ if value >= end-stepSize =>None
        case _ if value <= end-stepSize => {
          value += stepSize
          Some(value)
        }
      }
  }
  calculateNext
}

val myRange = range(10,20,3)
myRange()
myRange()
myRange()
myRange()
myRange()
myRange()