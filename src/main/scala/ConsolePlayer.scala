package RockPaperScissors
import RockPaperScissors.Move.Move

object ConsolePlayer {

  def getMove(turnHistory: List[TurnResult]): Option[Move]  = {
    scala.io.StdIn.readLine().toUpperCase() match {
      case "ROCK" =>Some(Move.ROCK)
      case "PAPER" => Some(Move.PAPER)
      case "SCISSORS" => Some(Move.SCISSORS)
      case _ => None
    }
  }
}
