def sizeDescription(l : List[Int]) : String = {
  if (l.size < 10) "short"
  else if (l.size >= 10 && l.size < 100 ) "long"
  else "very long"
}

val eleven = List(8, 4, 2, 3, 6, 9, 7, 5, 1, 0, 10)
val nine = List(8, 4, 2, 3, 6, 9, 7, 5, 1)
val overHundred = List(8, 4, 2, 3, 6, 9, 7, 5, 1, 0, 10, 8, 4, 2, 3, 6, 9, 7, 5, 1, 0, 10, 8, 4, 2, 3, 6, 9, 7, 5, 1, 0, 10, 8, 4, 2, 3, 6, 9, 7, 5, 1, 0, 10, 8, 4, 2, 3, 6, 9, 7, 5, 1, 0, 10, 8, 4, 2, 3, 6, 9, 7, 5, 1, 0, 10, 8, 4, 2, 3, 6, 9, 7, 5, 1, 0, 10, 8, 4, 2, 3, 6, 9, 7, 5, 1, 0, 10, 8, 4, 2, 3, 6, 9, 7, 5, 1, 0, 10, 8, 4, 2, 3, 6, 9, 7, 5, 1, 0, 10, 8, 4, 2, 3, 6, 9, 7, 5, 1, 0, 10, 8, 4, 2, 3, 6, 9, 7, 5, 1, 0, 10, 8, 4, 2, 3, 6, 9, 7, 5, 1, 0, 10, 8, 4, 2, 3, 6, 9, 7, 5, 1, 0, 10, 8, 4, 2, 3, 6, 9, 7, 5, 1, 0, 10)


println("Description of a list with eleven items: " + sizeDescription(eleven).toUpperCase())
println("Description of a list with nine items: " + sizeDescription(nine).toUpperCase())
println("Description of a list with over a hundred items: " + sizeDescription(overHundred).toUpperCase())