import Move.Move

abstract class Player(var name: String = "Unnamed", var score: Int = 0) {
  def getMove(): Move

  def setName(str: String) = {
    name = str
  }
}
