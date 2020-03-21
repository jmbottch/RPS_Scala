package RockPaperScissors.AI

import RockPaperScissors.Move.Move
import RockPaperScissors.{Move, TurnResult}

object RandomAI {
  val rand = scala.util.Random

  def getMove(turnHistory: List[TurnResult], randomInt : Int = rand.nextInt(3)): Move = {
    randomInt match {
      case 0 => Move.ROCK
      case 1 => Move.PAPER
      case 2 => Move.SCISSORS
      case _ => throw new IllegalStateException("The random value was " + randomInt + " but should be 0, 1 or 2")
    }
  }

}
