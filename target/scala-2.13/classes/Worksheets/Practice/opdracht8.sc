val evenList = List(0,2,4,6,8)
val unevenList = List(1,3,5,7,9)

def zipLists(listOne: List[Int], listTwo : List[Int]) : List[(Int, Int)] = {
  listOne.zip(listTwo)
}

println("Original lists: \nEven: " + evenList + "\nUneven: " + unevenList)
println("ZippedLists: \n" + zipLists(evenList, unevenList))