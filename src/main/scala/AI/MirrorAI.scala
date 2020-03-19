package RockPaperScissors.AI

import RockPaperScissors.AI.RandomAI.rand
import RockPaperScissors.Move.Move
import RockPaperScissors.{Move, TurnResult}

object MirrorAI {

  def getMove(turnHistory: List[TurnResult]): Move = {
    if(!turnHistory.isEmpty){
      val lastTurnResult :: _ = turnHistory
      val lastEnemyMove = lastTurnResult.movePlayer2

      lastEnemyMove
    }else
      RandomAI.getMove(turnHistory)
  }

}
