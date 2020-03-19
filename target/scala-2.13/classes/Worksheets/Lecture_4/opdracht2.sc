val list1 : List[Int]= List(1,6, 2, 3, 4)

//i returns the first element in a list
def firstElement(list : List[Int]) : Option[Int] = {
  list match {
    case head::_ => Some(head)
    case Nil => None

  }
}
//result i
println(firstElement(list1))


//ii returns the largest element in a list
def largestElement(list : List[Int], result : Int = 0) : Option[Int] = {
  list match {
    case Nil => Some(result)
    case head::Nil if head > result => Some(head)
    case head::tail if head > result => largestElement(tail, head)
    case head::tail => largestElement(tail, result)
  }
}

//result ii
println(largestElement(list1))


//iii replicate a string a number of times
val stringToReplicate = "\nReplicate me"

def replicate(string : Option[String], times : Option[Int], listOfReplicatedStrings : List[String] = List()) : String = {
  times match {
    case Some(x:Int) if x <= 0 => listOfReplicatedStrings.fold("")((x:String, y:String) => x + " " + y)
    case Some(x:Int) => replicate(string, Some(x-1), string.get::listOfReplicatedStrings)
  }
}

//result iii
replicate(Some(stringToReplicate), Some(12))

