def doubleHead(l: List[Int]) : List[Int] = {
  l.head * 2 :: l.tail
}
val list = List(8, 4, 2)

println("Original list: \n" + list)
println("list with doubled head : \n" + doubleHead(list))