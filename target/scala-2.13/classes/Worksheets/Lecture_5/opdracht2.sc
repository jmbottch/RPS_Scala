def makeLogger() : (String) => Unit = {
  var count = 0
  def increment() : Int ={
  count += 1
    count
  }
  def log(string: String) : Unit = {
  println(increment()+":" + string)
  }
  log
}
val log: String => Unit = makeLogger()
log("first")
log("second")
log("third")


//log is the closure
//it encloses a string, which means you can make a makeLogger() without any arguments
//than pass the string to the log function
//this can be used for logging activities
//voorbeeld voor gebruik
def makeNewObject(name : String) : Unit = {
  println("object created")
  val log: String => Unit = makeLogger()
  log(name + " was created")

}

//makeNewObject("User")