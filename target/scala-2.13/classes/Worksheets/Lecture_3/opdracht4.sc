val evenList = List(0,2,4,6,8)
val unevenList = List(1,3,5,7,9)

def zipLists(listOne:List[Int], listTwo : List[Int]) : List[(Int, Int)] = {
  if(listOne == Nil) {
    Nil
  } else if(listTwo == Nil) {
    Nil
  }  else {
    val head::tail = listOne;
    val head1::tail1 = listTwo;
    (head, head1) :: zipLists(tail, tail1)
  }
}

def swapLists(listOne:List[Int], listTwo : List[Int]) : List[(Int, Int)] = {
  if(listOne == Nil) {
    Nil
  } else if(listTwo == Nil) {
    Nil
  }  else {
    val head::tail = listOne;
    val head1::tail1 = listTwo;
    (head1, head) :: swapLists(tail1, tail)
  }
}

println("Original lists: \nEven: " + evenList + "\nUneven: " + unevenList)
println("should be: (0,1), (2,3) ,(4,5),(6,7) ,(8,9)")
println("ZippedLists: \n" + zipLists(evenList, unevenList))
println("swappedLists: \n" + swapLists(evenList, unevenList))