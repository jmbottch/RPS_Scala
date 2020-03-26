def log[A] (something: A => Unit) = {
  println(something)
  something
}

def makeObservable[A] (something: A => Unit) = {
  something
}

val obs0 = makeObservable((value : Any) => println(value))
val obs1 = makeObservable(log(obs0))

obs1("Hi") // prints Hi
obs1(1)    // prints 1
obs1(false)// prints false