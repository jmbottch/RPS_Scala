package RockPaperScissors
import RockPaperScissors.Move.Move

object ConsolePlayer {

  def getMove(turnHistory: List[TurnResult]): Move  = {
    scala.io.StdIn.readLine().toUpperCase() match {
      case "ROCK" =>Move.ROCK
      case "PAPER" => Move.PAPER
      case "SCISSORS" => Move.SCISSORS
    }
  }
}
