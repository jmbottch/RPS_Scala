
def mapNumbers(list : List[Int], intFunc : (Int) => Int, newList : List[Int] = List()) : List[Int] = {
  val head::tail = list
  if( tail != Nil ) {
    mapNumbers(tail, intFunc, newList :+ intFunc(head))
  } else {
     newList :+ intFunc(head)
  }
}
def multiplyBy2(int : Int = 0) : Int = {
  int * 2
}

def reduceBy1(int : Int = 0) : Int = {
  int - 1
}

def countNumbers(list : List[Int], result : Int = 0) : Int = {
  val head::tail = list
  if(tail != Nil) {
    countNumbers(tail, result + 1)
  } else {
    result + 1
  }
}

def existsNumber(list: List[Int], int: Int) : Boolean ={
val head::tail = list
  if (tail != Nil) {
    if (head == int) {
      true
    } else {
      existsNumber(tail, int)
    }
  } else {
    if (head == int) {
      true
    } else {
      false
    }
  }
}

def filterNumber(list : List[Int], int : Int, newList : List[Int] = List()) : List[Int] = {
  val head::tail = list
  if(tail != Nil) {
    if(head == int) {
      filterNumber(tail , int, newList :+ head)
    } else {
      filterNumber(tail, int, newList)
    }

  } else {
    if(head == int) {
      newList :+ head
    } else {
      newList
    }
  }
}

def dropNumber(list : List[Int], int : Int, newList : List[Int] = List()) : List[Int] = {
  val head::tail = list
  if(tail != Nil) {
    if(head != int) {
      dropNumber(tail , int, newList :+ head)
    } else {
      dropNumber(tail, int, newList)
    }

  } else {
    if(head != int) {
      newList :+ head
    } else {
      newList
    }
  }
}

def containsNumber(list: List[Int], int: Int) : Boolean = {
  val head::tail = list
  if (tail != Nil) {
    if (head == int) {
      true
    } else {
      containsNumber(tail, int)
    }
  } else {
    if (head == int) {
      true
    } else {
      false
    }
  }
}

def reverse(list : List[Int], newList : List[Int] = List()) : List[Int] = {
  val head::tail = list
  if(tail!= Nil) {
    reverse(tail, head::newList)
  } else {
    head::newList
  }
}


val evenList = List(0,2,2,4,6,8)
println("1. \nMap the numbers with a (int) => int : List[Int] function\nThis case multiply each record of the list by 2: \n" + mapNumbers(evenList, multiplyBy2))
println("3. \nReduce the numbers in the list by 1: \n" + mapNumbers(evenList, reduceBy1))
println("4. \nCount the records in the list: \n" + countNumbers(evenList))
println("6. \nDoes a number exist in the list?: \n" + existsNumber(evenList, 2))
println("7. \nFilter the numbers, \n show a list of all instances of 1 number: " + filterNumber(evenList, 2))
println("9. \nDrop numbers, \n show a list of all numbers \nbut leave out all instances of 1 number: " + dropNumber(evenList, 2))
println("10.\nDoes the list contain this number? " + containsNumber(evenList, 2))
println("11 \nReverse The list: " + reverse(evenList))