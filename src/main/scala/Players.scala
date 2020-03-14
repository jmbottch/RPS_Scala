import Move.Move

//this player can enter a move in the console
object ConsolePlayer {
    def getMove(): Move = {
      Move.stringToEnum(scala.io.StdIn.readLine("\nPlease enter a move:\nOptions: Rock, Paper, Scissors\nMove: "))
    };
}

//Random AI, this player returns a random move
object RandomAI {
  def getMove(): Move = {
    val opponent = scala.util.Random.nextInt(3); //0=rock, 1=paper, 2=scissors
    opponent match {
      case 0 => Move.ROCK
      case 1 => Move.PAPER
      case 2 => Move.SCISSORS
      case err => Move.UNKNOWN
    }
  }
}

//this player always plays rock..
object RockAI {
  def getMove(): Move = {
    Move.ROCK
  }
}
