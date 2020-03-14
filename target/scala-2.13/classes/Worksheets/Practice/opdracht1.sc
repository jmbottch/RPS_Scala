def swap(t:(String, Int)): (Int, String) = {
  val (s, n) = t
  (n, s)
}
val tuple = (" Hi ", 1)
val s = swap(tuple)

println("Original tuple: \n" + tuple)
println("Swapped tuple: \n" + swap(tuple))