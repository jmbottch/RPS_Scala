import scala.language.postfixOps
import scala.util.Try

val hundredList = List(25,25,25,25)
val hundredfourList = List(12,78,3,5,6)
val minusHundredFourList = List(-12,-78,-3,-5,-6)
val randomList = List(12,2,5,7,654,2,54,654897,5264,5468,3844,1651)
val sevenList : List[Int] = List(3, 2, 5, 9, 7, 6, 2, 3)
val emptyList : List[Int] = List(3)

//i
def sizeCalculator(list : List[Int]) : Int = {
  list match {
    case Nil => 0
    case head::tail => 1+ sizeCalculator(tail)
  }
}
println(sizeCalculator(sevenList))

//ii
def sumCalculator(list : List[Int]) : Int = {
  list match {
    case Nil => 0
    case head::tail => head + sumCalculator(tail)
  }

}
println("the sum of " + hundredList + " = "+ sumCalculator(hundredList))
println("the sum of " + hundredfourList + " = "+ sumCalculator(hundredfourList))


//iii
def maxCalculator(list: List[Int]): Int = {
  list match {
    case Nil => 0
    case head :: tail if tail == Nil => head
    case head :: second :: tail if head < second => maxCalculator(second :: tail)
    case head :: second :: tail => maxCalculator(head :: tail)
  }
}

println(maxCalculator(randomList))
println(maxCalculator(minusHundredFourList))


// iv
val stringToReplicate = "\nReplicate me"

def replicate(string : String, times : Int, listOfReplicatedStrings : List[String] = List()) : String = {
  times match {
    case times if times <= 0 => listOfReplicatedStrings.fold("")((x:String, y:String) => x + " " + y)
    case _ => replicate(string, times -1, string::listOfReplicatedStrings)
  }
}

replicate(stringToReplicate, 12)
