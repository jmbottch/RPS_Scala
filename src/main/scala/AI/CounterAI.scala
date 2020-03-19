package RockPaperScissors.AI

import RockPaperScissors.Move.Move
import RockPaperScissors.{Move, TurnResult}

object CounterAI {

  def getMove(turnHistory: List[TurnResult]): Move = {

    if(!turnHistory.isEmpty){
      val lastTurnResult :: _ = turnHistory
      val lastEnemyMove = lastTurnResult.movePlayer2

      lastEnemyMove match {
        case RockPaperScissors.Move.ROCK => Move.PAPER
        case RockPaperScissors.Move.PAPER => Move.SCISSORS
        case RockPaperScissors.Move.SCISSORS => Move.ROCK
      }
    }else
      RandomAI.getMove(turnHistory)
  }

}
