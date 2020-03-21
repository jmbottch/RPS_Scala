package RockPaperScissors.AI

import RockPaperScissors.Move.Move
import RockPaperScissors.{Move, TurnResult}

object CounterAI {

  def getMove(turnHistory: List[TurnResult]): Move = {
    turnHistory match {
      case Nil => RandomAI.getMove(turnHistory)
      case head :: _ => head match {
        case RockPaperScissors.Move.ROCK => Move.PAPER
        case RockPaperScissors.Move.PAPER => Move.SCISSORS
        case RockPaperScissors.Move.SCISSORS => Move.ROCK
        case _ => RandomAI.getMove(turnHistory)
      }
    }
  }
}
