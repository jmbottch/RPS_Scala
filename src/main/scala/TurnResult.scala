import Move.Move
import Result.Result

class TurnResult(movePlayer1: Move, movePlayer2: Move) {

  def getMovePlayer1(): Move = {
    movePlayer1
  }

  def getMovePlayer2(): Move = {
    movePlayer2
  }

  def getResult(): Result = {
    movePlayer1 match {
      case Move.ROCK => {
        if (movePlayer2 == Move.ROCK) Result.TIE
        else if (movePlayer2 == Move.PAPER) Result.PLAYER2_WON
        else if (movePlayer2 == Move.SCISSORS) Result.PLAYER1_WON
        else Result.UNKNOWN
      }
      case Move.PAPER => {
        if (movePlayer2 == Move.ROCK) Result.PLAYER1_WON
        else if (movePlayer2 == Move.PAPER) Result.TIE
        else if (movePlayer2 == Move.SCISSORS) Result.PLAYER2_WON
        else Result.UNKNOWN
      }
      case Move.SCISSORS => {
        if (movePlayer2 == Move.ROCK) Result.PLAYER2_WON
        else if (movePlayer2 == Move.PAPER) Result.PLAYER1_WON
        else if (movePlayer2 == Move.SCISSORS) Result.TIE
        else Result.UNKNOWN
      }
      case Move.UNKNOWN => Result.UNKNOWN
    }
  }

}
