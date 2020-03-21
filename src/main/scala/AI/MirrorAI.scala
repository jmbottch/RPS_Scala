package RockPaperScissors.AI

import RockPaperScissors.AI.RandomAI.rand
import RockPaperScissors.Move.Move
import RockPaperScissors.{Move, TurnResult}

object MirrorAI {

  def getMove(turnHistory: List[TurnResult]): Move = {

    turnHistory match {
      case Nil => RandomAI.getMove(turnHistory)
      case head :: _ => head.movePlayer2
    }
  }
}
