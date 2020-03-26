val log = (value : Int) => {
  println("Logging: " + value)
  value
}

val addCurry = (x : Int) => (y:Int) => x + y

val addWithArgLogging = log andThen addCurry andThen(log andThen _) andThen (_ andThen log)
addWithArgLogging(5)(3)