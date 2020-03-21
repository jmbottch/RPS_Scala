def printList(l: List[String]) {
  if (l != Nil) {
    val head :: tail = l
    printList(tail)
    println(head)
  }
}


def listen(history: List[String] = Nil) {
  val input = scala.io.StdIn.readLine()
  if (input == "quit")
    printList(history)
  else
    listen(input :: history)
}
