import scala.language.postfixOps
import scala.util.Try

//i
val sevenList : List[Int] = List(3, 2, 5, 9, 7, 6, 2)
val emptyList : List[Int] = List(3)

def sizeCalculator(list : List[Int], result: BigInt = 0) : BigInt = {
  val head :: tail = list
    if(tail == Nil) {
      result + 1
    } else {
      sizeCalculator(tail, result + 1)
    }
}
println(sizeCalculator(sevenList))

//ii
val hundredList = List(25,25,25,25)
val hundredfourList = List(12,78,3,5,6)
val minusHundredFourList = List(-12,-78,-3,-5,-6)
val randomList = List(12,2,5,7,654,2,54,654897,5264,5468,3844,1651)

def sumCalculator(list : List[Int], result : Int = 0) : Int = {
  val head :: tail = list
  val newresult = result + head
  if(tail == Nil) {
    result + head
  } else {
    sumCalculator(tail, newresult)
  }

}
println("the sum of " + hundredList + " = "+ sumCalculator(hundredList))
println("the sum of " + hundredfourList + " = "+ sumCalculator(hundredfourList))


//iii
def maxCalculator(l: List[Int]): Int = {
  if (l == Nil) 0
  else if (l.tail == Nil) l.head
  else {
    val head::second::tail = l
    if (head < second) maxCalculator(second::tail)
    else maxCalculator(head::tail)
  }
}

println(maxCalculator(randomList))
println(maxCalculator(minusHundredFourList))


// iv
val stringToReplicate = "\nReplicate me"

def replicate(string : String, times : Int, listOfReplicatedStrings : List[String] = List()) : String = {
  if (times > 0) {
    val newList : List[String] = string :: listOfReplicatedStrings
    replicate(string, times - 1, newList)
  } else {
    val concatWithSpace = (x:String, y:String) => x + " " + y
    val replicatedString = listOfReplicatedStrings.fold("")(concatWithSpace)
    replicatedString
  }
}

replicate(stringToReplicate, 12)
