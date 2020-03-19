import org.graalvm.compiler.graph.Node.Input

def mapNumbers(list : List[Int], intFunc : (Int, Int) => Int, input : Int,  newList : List[Int] = List()) : List[Int] = {
  list match {
    case Nil => Nil
    case head::Nil => newList :+ intFunc(head, input)
    case head::tail => mapNumbers(tail, intFunc, input,  newList :+ intFunc(head, input))
  }
}
def multiplyBy(int : Int = 0, input: Int) : Int = {
  int * input
}

def reduceBy(int : Int = 0, input: Int) : Int = {
  int - input
}

def countNumbers(list : List[Int], result : Int = 0) : Int = {
  list match {
    case Nil => 0
    case head::tail => 1 + countNumbers(tail)
  }

}

def existsNumber(list: List[Int], int: Int) : Boolean ={

  list match {
    case Nil => false
    case head::_ if head == int => true
    case head::tail => existsNumber(tail, int)
  }
}

def filterNumber(list : List[Int], int : Int, newList : List[Int] = List()) : List[Int] = {
  list match {
    case Nil => Nil
    case head::Nil if head == int => head::newList
    case head::Nil if head != int => newList
    case head::tail if head == int => filterNumber(tail, int, head::newList)
    case head::tail if head != int => filterNumber(tail, int, newList)
  }
}


def dropNumber(list : List[Int], int : Int, newList : List[Int] = List()) : List[Int] = {
  list match {
    case Nil => Nil
    case head::Nil if head != int => head::newList
    case head::Nil if head == int => newList
    case head::tail if head != int => dropNumber(tail, int, head::newList)
    case head::tail if head == int => dropNumber(tail, int, newList)
  }

}

def containsNumber(list: List[Int], int: Int) : Boolean = {
  list match {
    case Nil => false
    case head::_ if head == int => true
    case head::tail => containsNumber(tail, int)
    }

}

def reverse(list : List[Int], newList : List[Int] = List()) : List[Int] = {
  list match {
    case Nil => Nil
    case head::Nil => head::newList
    case head::tail => reverse(tail, head::newList)
  }
}


val evenList = List(0,2,2,4,6,8)
println("1. \nMap the numbers with a (int) => int : List[Int] function\nThis case multiply each record of the list by 2: \n" + mapNumbers(evenList, multiplyBy, 3))
println("3. \nReduce the numbers in the list by : 2\n" + mapNumbers(evenList, reduceBy, 2))
println("4. \nCount the records in the list: \n" + countNumbers(evenList))
println("6. \nDoes a number exist in the list?: \n" + existsNumber(evenList, 2))
println("7. \nFilter the numbers, \n show a list of all instances of 1 number: " + filterNumber(evenList, 2))
println("9. \nDrop numbers, \n show a list of all numbers \nbut leave out all instances of 1 number: " + dropNumber(evenList, 2))
println("10.\nDoes the list contain this number? " + containsNumber(evenList, 2))
println("11 \nReverse The list: " + reverse(evenList))