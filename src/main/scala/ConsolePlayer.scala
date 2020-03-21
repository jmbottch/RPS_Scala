package RockPaperScissors
import RockPaperScissors.Move.Move

object ConsolePlayer {

  def getMove(turnHistory: List[TurnResult]): Move = {
    val validMove = false;

    while(!validMove){

      println("Your turn. Choose ROCK, PAPER or SCISSORS")
      val input = scala.io.StdIn.readLine().toUpperCase()
      input match {
        case "ROCK" => return Move.ROCK
        case "PAPER" => return Move.PAPER
        case "SCISSORS" => return Move.SCISSORS
      }
    }
    throw new IllegalStateException("Should not be able to exit the while loop")
  }
}
