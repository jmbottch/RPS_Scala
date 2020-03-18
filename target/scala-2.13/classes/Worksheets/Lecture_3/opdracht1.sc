import scala.language.postfixOps

val people = List("Alfred", "Boris", "Ann", "Jan", "Anya", "Monique", "Christophe", "Jan", "Joris", "Bert", "Olaf")
val concatWithSpace = (x : String, y : String) => x + " " + y
val dear = "Dear"

//i add "Dear " in front of each name
def addDearOneString(persons : List[String]) : List[String] = {
  if(persons == Nil) {
    Nil
  } else {
    val head::tail = persons
    val newhead = "\nDear " + head
    newhead :: addDearOneString(tail)
  }
}

//ii some other function to do almost the same
def addDear(persons : List[String]) : List[(String, String)] = {
  if(persons == Nil) {
    Nil
  } else {
    val head::tail = persons
    val dear : String = "\nDear "
    println(dear + head)
    addDear(tail)
  }
}

//iii show a list of all letters - Result: List[Char]
def showAllLetters(persons : List[String]) : List[Char] = {
  if(persons == Nil) {
    Nil
  } else {
    val head::tail = persons
    val newHead : List[Char]= head.toList
    newHead ::: showAllLetters(tail)
  }
}

//iv Show a list of all unique letters - Result: List[Char]
def uniqueLetters(persons : List[String]) : List[Char] = {
  if(persons == Nil) {
    Nil
  } else {
    val head::tail = persons
    val newHead : List[Char] = head.toList
    (newHead:::uniqueLetters(tail)).distinct
  }
}



//v Add together the size of all Names in the list
def calculateAllSizes(persons : List[String], result : Int = 0) : Int = {
  if (persons == Nil) {
    result
  }
  else {
    val head :: tail = persons
    if(tail == Nil) {
      result + head.size
    } else {
      calculateAllSizes(tail, result + head.size)
    }
  }
}

//vi create the string "Dear <name1>,<name2>,etc" use .fold - Result : String
def dearEveryone(persons : List[String]) : String = {
  val concatWithComma = (x : String, y : String) => x + y + ", "
  if (persons != Nil) {
    val foldedPersons = persons.fold("")(concatWithComma)
    val endString :String = "Dear " + foldedPersons
    endString
  } else {
    "no persons"
  }
}

//vii how many people have 'an' in their name?
def doYouHaveAn(persons : List[String]) : Int = {
  val peopleWithAn = persons.filter(_.contains("an"))
  val peopleWithAnCapital = persons.filter(_.contains("An"))
  peopleWithAn.size + peopleWithAnCapital.size
}

//viii how many people have names that are 3 letters long
def threeLetters(persons : List[String], result: Int = 0) : Int = {
  val head :: tail = persons
  if (tail != Nil) {
    if (head.size == 3) {
      threeLetters(tail, result + 1)
    } else {
      threeLetters(tail, result)
    }
  } else {
    if (head.size == 3) {
      result + 1
    } else {
      result
    }
  }
}

  //ix Do all names contain a capital letter?
  def allHaveCapital(persons: List[String]): Boolean = {
    val head :: tail = persons
    if (tail != Nil) {
      if (head.head.isUpper) {
        allHaveCapital(tail)
      } else {
        false
      }
    } else {
      if (head.head.isUpper) {
        true
      } else {
        false
      }

    }

  }

//x Is there any name with y or q?
def isThereAYorQ(persons : List[String]) : Boolean = {
  if(persons.filter(_.contains("q")).nonEmpty || persons.filter(_.contains("y")).nonEmpty)  {
    true
  }
 else {
    false
  }
}

//xi show all name with an y or q in it
def showAllNamesWithQOrY(persons : List[String]) : List[String] = {
  if (persons == Nil) Nil
  else {
    val head::tail = persons
    if (!head.toLowerCase().contains("q") && !head.toLowerCase().contains("y")) {
      showAllNamesWithQOrY(tail)
    }
    else head::showAllNamesWithQOrY(tail)
  }
  }

//xii
def groupNamesByLength(size : Int, persons : List[String], groupedList : List[String] = List()) : (Int, List[String]) = {
  val head::tail = persons
  if(tail != Nil) {
    if(head.size == size) {
      groupNamesByLength(size, tail, head::groupedList)
    } else {
      groupNamesByLength(size, tail, groupedList)
    }
  } else {
    val grouped : (Int, List[String]) = (size, groupedList)
    grouped
  }


}
//xiii
def areThereDuplicates(persons : List[String]) : Boolean = {
  if(persons.distinct.size != persons.size) {
     true
  } else {
     false
  }
}









println("Original list: " + people)
// i
println("1. Added dear and put it in one string: " + addDearOneString(people))
//ii
println("2. Added Dear before each person: " + addDear(people))
//iii
println("3. All Letters in the list " + showAllLetters(people))
//iv
println("4. All unique letters in the list" + uniqueLetters(people))
//v should be 54
println("5. The size of all names together is " + calculateAllSizes(people))
//vi
println("6. Dear everyone \n" + dearEveryone(people))
//vii
println("7. This many people have 'an' in their name: " + doYouHaveAn(people))
//viii
println("8. This many people have 3 letter names: " + threeLetters(people))
//ix
println("9. All names start with a Capital in this list: " + allHaveCapital(people))
//x
println("10. Are there any people with the y or q in their name? " + isThereAYorQ(people))
//xi
println("11. All names in the list with y or Q " + showAllNamesWithQOrY(people))
//xii
println("12. All names that have 4 characters: " + groupNamesByLength(3, people) )
//xiii
println("13. Are there duplicates in the list? " + areThereDuplicates(people))