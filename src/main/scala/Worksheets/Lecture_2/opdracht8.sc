val evenList = List(0,2,4,6,8)
val unevenList = List(1,3,5,7,9)

var zippedList = List() : List[(Int, Int)]
def zipLists(listOne: List[Int], listTwo : List[Int]) : List[(Int, Int)] = {
  listOne.zip(listTwo)
}

println("Original lists: \nEven: " + evenList + "\nUneven: " + unevenList)
println("should be: (0,1), (2,3) ,(4,5),(6,7) ,(8,9)")
println("ZippedLists: \n" + zipLists(evenList, unevenList))


