def makeObservable[A] (something: A => Unit) = {
  something
}

val obs0 = makeObservable((value : Any) => println(value))

obs0("Hi") // prints Hi
obs0(1)    // prints 1
obs0(false)// prints false