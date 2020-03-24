def createMemory() : (String) => String = {

  var newMemory = ""

  def memorize(string: String) : String = {
    val memory = newMemory
    newMemory = string
    memory
  }
  memorize
}

val remember: String => String = createMemory()
remember("Hello")
remember("World")
remember("")