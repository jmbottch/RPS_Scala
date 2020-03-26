def log[A] (something: A => Unit) = {
  println(something)
  something
}

def makeObservable (func: Unit) : Unit = {
  func
}
def map[A] (string: String => String)(logger : A => Unit) ={


}
val logger = log((value : String) => value)
val mapper = map((x:String) => x * 2)(logger)
val obs = makeObservable(mapper)

obs// prints Hi
//obs(1)    // prints 1
//obs(false)// prints false