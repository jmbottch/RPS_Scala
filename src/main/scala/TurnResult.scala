package RockPaperScissors

import RockPaperScissors.Move.Move
import RockPaperScissors.Result.Result

class TurnResult(val movePlayer1: Move, val movePlayer2: Move, val result: Result){
  def invert(): TurnResult = {
    val invertedResult = result match {
      case Result.PLAYER1_WON => Result.PLAYER2_WON
      case Result.PLAYER2_WON => Result.PLAYER1_WON
      case Result.TIE => Result.TIE

    }
    new TurnResult(movePlayer2, movePlayer1, invertedResult)
  }
}
