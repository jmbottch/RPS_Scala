package RockPaperScissors.AI

import RockPaperScissors.Move.Move
import RockPaperScissors.{Move, Result, TurnResult}

import scala.annotation.tailrec

object RepeatSuccessAI {

  def getMove(turnHistory: List[TurnResult]): Move = {
    getLastSuccessfulMove(turnHistory)
  }

  @tailrec
  def getLastSuccessfulMove(turnHistory: List[TurnResult]): Move = {
    turnHistory match {
      case Nil => RandomAI.getMove(turnHistory)
      case head::tail if head.result == Result.PLAYER1_WON => head.movePlayer1
      case head::tail => getLastSuccessfulMove(tail)
    }
  }
}
